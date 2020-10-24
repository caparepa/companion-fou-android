package com.caparepa.companionfou.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.provider.OpenableColumns
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.caparepa.companionfou.BuildConfig
import com.caparepa.companionfou.R
import com.caparepa.companionfou.utils.library.OnOneOffClickListener
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter
import org.threeten.bp.temporal.ChronoUnit
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.lang.reflect.Type

inline fun <reified T : Any> Any?.mapTo(newClass: Class<T>): T? =
    Gson().run {
        fromJson(toJson(this@mapTo), newClass)
    }

/**
 * Parser extensions
 */
fun Any.toJsonString(): String? {
    justTry {
        val gson = Gson()
        return gson.toJson(this)
    }
    return null
}

fun <T> String.objectFromJson(classOfT: Class<T>): Any? {
    val gson = Gson()
    return gson.fromJson<Any>(this, classOfT as Class<*>)
}

inline fun <reified T : Any> String.toKotlinObject(): T {
    val gson = Gson()
    return gson.fromJson(this, T::class.java)
}

inline fun <reified T> parseArray(json: String, typeToken: Type): T {
    val gson = GsonBuilder().create()
    return gson.fromJson<T>(json, typeToken)
}

inline fun <reified T : Any> JsonObject.toKotlinObject(): T {
    val gson = Gson()
    return gson.fromJson(this, T::class.java)
}

inline fun <reified T : Any> JsonArray.toKotlinObject(): T {
    val gson = Gson()
    return gson.fromJson(this, T::class.java)
}


/**
 * Context Extensions
 */
fun Context.toastLong(text: CharSequence) = Toast.makeText(this, text, Toast.LENGTH_LONG).show()

fun Context.toastShort(text: CharSequence) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

/**
 * General extensions
 */

fun getClassName(anyClass: Any): String? {
    return anyClass::class.java.simpleName
}

inline fun <T> justTry(block: () -> T) = try {
    block()
} catch (e: Throwable) {
}

inline fun debugMode(block: () -> Unit) {
    if (BuildConfig.DEBUG) {
        block()
    }
}

/**
 * Logger extension
 */
fun logger(mode: Int, tag: String, message: String, t: Throwable? = null) {

    if (t == null) {
        when (mode) {
            Log.DEBUG -> Log.d(tag, message)
            Log.ERROR -> Log.e(tag, message)
            Log.INFO -> Log.i(tag, message)
            Log.VERBOSE -> Log.v(tag, message)
            Log.WARN -> Log.w(tag, message)
            else -> Log.wtf(tag, message)
        }
    } else {
        when (mode) {
            Log.DEBUG -> Log.d(tag, message, t)
            Log.ERROR -> Log.e(tag, message, t)
            Log.INFO -> Log.i(tag, message, t)
            Log.VERBOSE -> Log.v(tag, message, t)
            Log.WARN -> Log.w(tag, message, t)
            else -> Log.wtf(tag, message, t)
        }
    }
}


fun View.makeInvisible() {
    this.visibility = View.INVISIBLE
}

fun View.setOpacity(percent: Int) {
    this.background.alpha = percent
}

/**
 * File & image handling
 */
@Throws(IOException::class)
fun copyStream(input: InputStream, output: OutputStream, bufferSize: Int): Long {
    val buffer = ByteArray(bufferSize)
    var totalByteCount: Long = 0
    var justReadCount: Int
    while (-1 != input.read(buffer, 0, bufferSize).also { justReadCount = it }) {
        output.write(buffer, 0, justReadCount)
        totalByteCount += justReadCount.toLong()
    }
    return totalByteCount
}

fun ImageView.loadImage(context: Context, imageUrl: String, errorDrawable: Drawable) {
    justTry {
        Glide.with(context)
            .load(imageUrl)
            .error(errorDrawable)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(this)
    }
}

fun Uri.getName(context: Context): String? {
    val returnCursor = context.contentResolver.query(this, null, null, null, null)
    val nameIndex = returnCursor?.getColumnIndex(OpenableColumns.DISPLAY_NAME)
    returnCursor?.moveToFirst()
    val fileName = returnCursor?.getString(nameIndex!!)
    returnCursor?.close()
    return fileName
}

fun View.setOneOffClickListener(action: () -> Unit) {
    setOnClickListener(object : OnOneOffClickListener() {
        override fun onSingleClick(v: View?) {
            action.invoke()
        }
    })
}

fun delayAction(delay: Long, action: () -> Unit) = CoroutineScope(Dispatchers.Main).launch {
    kotlinx.coroutines.delay(delay)
    action.invoke()
}

/*fun <T> MutableLiveData<T>.toSingleEvent(): MutableLiveData<T> {
    val result = LiveEvent<T>()
    result.addSource(this) {
        result.value = it
    }
    return result
}*/

//this is for checking if the datetime string we receive from api has time offset (+00:00)
//or is simple ISO 8601 format (Z)

/**
 * This makes the validation and regex replace
 */
fun String.getFormattedDateTime(): String {
    //val regexIso8601 = Regex("(\\d{4}-\\d{1,2}-\\d{1,2}T\\d{2}:\\d{2}:\\d{2}.\\d{1,6}\\W\\d{2}:\\d{2})")
    val regexCustomIso8601 =
        Regex("(\\d{4}-\\d{1,2}-\\d{1,2} \\d{2}:\\d{2}:\\d{2}.\\d{1,6}\\W\\d{2}:\\d{2})")
    val regexCustomIso8601NoNano =
        Regex("(\\d{4}-\\d{1,2}-\\d{1,2} \\d{2}:\\d{2}:\\d{2}\\W\\d{2}:\\d{2})")

    return if (this.contains(regexCustomIso8601) xor this.contains(regexCustomIso8601NoNano)) {
        this.pregReplaceSpaceDateTime()
    } else {
        this
    }
}

/**
 * Validate whether the API date is timezoned or not
 * TODO: this might be deprecated
 */
fun String.validateDateTimeOffset(): Boolean {
    val regex = Regex("([+-]\\d{2}:\\d{2})")
    return this.contains(regex)
}

/**
 * Replaces the space for a T in the date given by the api
 * TODO: beware this method, it might change dependin on how API returns the dates
 */
fun String.pregReplaceSpaceDateTime(): String {
    return Regex(" ").replace(this, "T")
}

/**
 * Get today's date time with the device's time zone
 */
fun getToday(): String {
    return LocalDateTime.now(ZoneId.systemDefault())
        .withSecond(0)
        .format(DateTimeFormatter.ofPattern(DATE_FORMAT_ISO_8601))
}

fun String?.isToday(): Boolean {
    if (this == null) return false
    val date = this.getFormattedDateTime().getFlatDateTimeObj()
    val today = getTodayFlatObj()
    return date.isEqual(today)
}

/**
 * Get today's date string at 00:00 with the devices time zone
 */
fun getTodayFlat(): String {
    return LocalDateTime.now()
        .withHour(0)
        .withMinute(0)
        .withSecond(0)
        .withNano(0)
        .format(DateTimeFormatter.ISO_DATE_TIME)
}

fun getTodayFlatObj(): LocalDateTime {
    return LocalDateTime.now()
        .withHour(0)
        .withMinute(0)
        .withSecond(0)
        .withNano(0)
}

/**
 * Get date time (tz or not), with 00:00h
 * TODO: evaluate if we can forgo the isZoned parameter
 */
fun String.getFlatDateTime(isZoned: Boolean): String {
    return if (!isZoned)
        this.getFormattedDateTime().getFlatDate()
    else
        this.getFormattedDateTime().getFlatZonedDate()
}

fun String.getDateTime(isZoned: Boolean): String {
    return if (!isZoned)
        this.pregReplaceSpaceDateTime().getDateTime()
    else
        this.pregReplaceSpaceDateTime().getZonedDateTime()
}

//Get the LocalDateTime object from a String
fun String.getFlatDate(): String {
    return this.getFlatDateTimeObj().format(DateTimeFormatter.ISO_DATE_TIME)
}

fun String.getFlatZonedDate(): String {
    return this.getFlatZonedDateTimeObj().format(DateTimeFormatter.ISO_DATE_TIME)
}

//get date time as is in String
fun String.getDateTime(): String {
    return this.getDateTimeObj().format(DateTimeFormatter.ISO_DATE_TIME)
}

fun String.getZonedDateTime(): String {
    return this.getZonedDateTimeObj().format(DateTimeFormatter.ISO_DATE_TIME)
}

//Get the date time object as is in Object
fun String.getDateTimeObj(): LocalDateTime {
    return LocalDateTime.parse(this, DateTimeFormatter.ISO_DATE_TIME)
}

fun String.getZonedDateTimeObj(): ZonedDateTime {
    return ZonedDateTime.parse(this, DateTimeFormatter.ISO_DATE_TIME)
}

//Get the time objects set at 00:00:00 in Object
fun String.getFlatDateTimeObj(): LocalDateTime {
    return LocalDateTime.parse(this, DateTimeFormatter.ISO_DATE_TIME)
        .withHour(0)
        .withMinute(0)
        .withSecond(0)
        .withNano(0)
}

fun String.getFlatZonedDateTimeObj(): ZonedDateTime {
    return ZonedDateTime.parse(this, DateTimeFormatter.ISO_DATE_TIME)
        .withHour(0)
        .withMinute(0)
        .withSecond(0)
        .withNano(0)
}

fun String.getDateOffsetDays(offset: Long, isAdd: Boolean): String {
    val date = if (isAdd)
        this.getFormattedDateTime().getDateTimeObj().plusDays(offset)
    else
        this.getFormattedDateTime().getDateTimeObj().minusDays(offset)
    return date.format(DateTimeFormatter.ISO_DATE_TIME)
}

fun getDateTimeDiff(unit: ChronoUnit, now: LocalDateTime?, date: LocalDateTime?): Long {
    return unit.between(now, date)
}

/**
 *
 **/
fun Context.getClassDrawable(className: String, rarity: Int): Drawable? {
    return when (className) {
        CLASS_SABER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_saber_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_saber_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_saber_1)
            }
        }
        CLASS_ARCHER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_archer_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_archer_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_archer_1)
            }
        }
        CLASS_LANCER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_lancer_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_lancer_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_lancer_1)
            }
        }
        CLASS_RIDER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_rider_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_rider_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_rider_1)
            }
        }
        CLASS_CASTER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_caster_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_caster_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_caster_1)
            }
        }
        CLASS_ASSASSIN -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_assassin_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_assassin_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_assassin_1)
            }
        }
        CLASS_BERSERKER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_berserker_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_berserker_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_berserker_1)
            }
        }
        CLASS_SHIELDER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_shielder_2)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_shielder_3)
            }
        }
        CLASS_RULER -> {
            ContextCompat.getDrawable(this, R.drawable.class_ruler_3)
        }
        CLASS_ALTER_EGO -> {
            ContextCompat.getDrawable(this, R.drawable.class_alter_ego_3)
        }
        CLASS_AVENGER -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_avenger_2)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_avenger_3)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_avenger_0)
            }
        }
        CLASS_DEMON_GOD_PILLAR -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_unknown)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_unknown)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_unknown)
            }
        }
        CLASS_BEAST_II -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            }
        }
        CLASS_BEAST_I -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            }
        }
        CLASS_MOON_CANCER -> {
            ContextCompat.getDrawable(this, R.drawable.class_moon_cancer_3)
        }
        CLASS_BEAST_III_R -> {
            if (rarity == 3) {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            } else if (rarity > 3) {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            } else {
                ContextCompat.getDrawable(this, R.drawable.class_beast)
            }
        }
        CLASS_FOREIGNER -> {
            ContextCompat.getDrawable(this, R.drawable.class_foreigner_3)
        }
        CLASS_BEAST_III_L -> {
            ContextCompat.getDrawable(this, R.drawable.class_beast)
        }
        CLASS_BEAST_UNKNOWN -> {
            ContextCompat.getDrawable(this, R.drawable.class_unknown)
        }
        else -> {
            ContextCompat.getDrawable(this, R.drawable.class_unknown)
        }
    }
}

fun Context.getRarityDrawable(rarity: Int): Drawable? {
    return when (rarity) {
        1 -> {
            ContextCompat.getDrawable(this, R.drawable.star1)
        }
        2 -> {
            ContextCompat.getDrawable(this, R.drawable.star2)
        }
        3 -> {
            ContextCompat.getDrawable(this, R.drawable.star3)
        }
        4 -> {
            ContextCompat.getDrawable(this, R.drawable.star4)
        }
        5 -> {
            ContextCompat.getDrawable(this, R.drawable.star5)
        }
        else -> {
            ContextCompat.getDrawable(this, R.drawable.star0)
        }
    }
}

fun String.getPrettyClassName(): String {
    return when (this) {
        CLASS_SABER -> { "Saber" }
        CLASS_ARCHER -> { "Archer" }
        CLASS_LANCER -> { "Lancer" }
        CLASS_RIDER -> { "Rider" }
        CLASS_CASTER -> { "Caster" }
        CLASS_ASSASSIN -> { "Assassin" }
        CLASS_BERSERKER -> { "Berserker" }
        CLASS_SHIELDER -> { "Shielder" }
        CLASS_RULER -> { "Ruler" }
        CLASS_ALTER_EGO -> { "Alter Ego" }
        CLASS_AVENGER -> { "Avenger" }
        CLASS_DEMON_GOD_PILLAR -> { "Demon God Pillar" }
        CLASS_BEAST_II -> { "Beast II" }
        CLASS_BEAST_I -> { "Beast I" }
        CLASS_MOON_CANCER -> { "Moon Cancer" }
        CLASS_BEAST_III_R -> { "Beast III R" }
        CLASS_FOREIGNER -> { "Foreigner" }
        CLASS_BEAST_III_L -> { "Beast III L" }
        CLASS_BEAST_UNKNOWN -> { "Beast Unknown" }
        else -> { "Unknown" }
    }
}