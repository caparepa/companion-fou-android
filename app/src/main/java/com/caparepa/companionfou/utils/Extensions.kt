package com.caparepa.companionfou.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.provider.OpenableColumns
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.caparepa.companionfou.BuildConfig
import com.google.gson.Gson
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

inline fun <reified T : Any> Any?.mapTo(newClass: Class<T>): T? =
    Gson().run {
        fromJson(toJson(this@mapTo), newClass)
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

/*fun <T> MutableLiveData<T>.toSingleEvent(): MutableLiveData<T> {
    val result = LiveEvent<T>()
    result.addSource(this) {
        result.value = it
    }
    return result
}*/

