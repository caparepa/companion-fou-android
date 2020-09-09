package com.caparepa.companionfou.utils.converters

import androidx.room.TypeConverter
import com.caparepa.companionfou.data.db.entity.nice.servant.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object NiceDataConverter {

    /**
     * Voice lines converter
     */

    @TypeConverter
    fun fromVoiceLineCondItemList(list: List<VoiceLineCondItem?>?): String? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toVoiceLineCondItemList(list: String?): List<VoiceLineCondItem>? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().fromJson<List<VoiceLineCondItem>>(list, type)
    }

    @TypeConverter
    fun fromVoiceLineItemList(list: List<VoiceLineItem?>?): String? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toVoiceLineItemList(list: String?): List<VoiceLineItem>? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().fromJson<List<VoiceLineItem>>(list, type)
    }

    /**
     * Comment item type converter
     */

    @TypeConverter
    fun fromCommentItemList(list: List<CommentItem?>?): String? {
        val type = object : TypeToken<List<CommentItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toCommentItemList(list: String?): List<CommentItem>? {
        val type = object : TypeToken<List<CommentItem>>() {}.type
        return Gson().fromJson<List<CommentItem>>(list, type)
    }

    /**
     * Profile costume item
     */
    @TypeConverter
    fun fromProfileCostumeItem(list: List<ProfileCostumeItem?>?): String? {
        val type = object : TypeToken<List<ProfileCostumeItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toProfileCostumeItem(list: String?): List<ProfileCostumeItem>? {
        val type = object : TypeToken<List<ProfileCostumeItem>>() {}.type
        return Gson().fromJson<List<ProfileCostumeItem>>(list, type)
    }

    /**
     * Base Sval Item
     */
    @TypeConverter
    fun fromBaseSvalItem(list: List<BaseSvalItem?>?): String? {
        val type = object : TypeToken<List<BaseSvalItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toBaseSvalItem(list: String?): List<BaseSvalItem>? {
        val type = object : TypeToken<List<BaseSvalItem>>() {}.type
        return Gson().fromJson<List<BaseSvalItem>>(list, type)
    }

    /**
     * CkSelfIndvItem and CkOpIndvItem
     */

    @TypeConverter
    fun fromCkSelfIndvItem(list: List<CkSelfIndvItem?>?): String? {
        val type = object : TypeToken<List<CkSelfIndvItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toCkSelfIndvItem(list: String?): List<CkSelfIndvItem>? {
        val type = object : TypeToken<List<CkSelfIndvItem>>() {}.type
        return Gson().fromJson<List<CkSelfIndvItem>>(list, type)
    }

    @TypeConverter
    fun fromCkOpIndvItem(list: List<CkOpIndvItem?>?): String? {
        val type = object : TypeToken<List<CkOpIndvItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toCkOpIndvItem(list: String?): List<CkOpIndvItem>? {
        val type = object : TypeToken<List<CkOpIndvItem>>() {}.type
        return Gson().fromJson<List<CkOpIndvItem>>(list, type)
    }

    /**
     * BuffValItem
     */
    @TypeConverter
    fun fromBuffValItem(list: List<BuffValItem?>?): String? {
        val type = object : TypeToken<List<BuffValItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toBuffValItem(list: String?): List<BuffValItem>? {
        val type = object : TypeToken<List<BuffValItem>>() {}.type
        return Gson().fromJson<List<BuffValItem>>(list, type)
    }

    /**
     * BuffItem
     */
    @TypeConverter
    fun fromBuffItem(list: List<BuffItem?>?): String? {
        val type = object : TypeToken<List<BuffItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toBuffItem(list: String?): List<BuffItem>? {
        val type = object : TypeToken<List<BuffItem>>() {}.type
        return Gson().fromJson<List<BuffItem>>(list, type)
    }

    /**
     * Function item
     */
    @TypeConverter
    fun fromFunctionItem(list: List<FunctionItem?>?): String? {
        val type = object : TypeToken<List<FunctionItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toFunctionItem(list: String?): List<FunctionItem>? {
        val type = object : TypeToken<List<FunctionItem>>() {}.type
        return Gson().fromJson<List<FunctionItem>>(list, type)
    }

    /**
     * Individuality item
     */
    @TypeConverter
    fun fromIndividualityItem(list: List<IndividualityItem?>?): String? {
        val type = object : TypeToken<List<IndividualityItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toIndividualityItem(list: String?): List<IndividualityItem>? {
        val type = object : TypeToken<List<IndividualityItem>>() {}.type
        return Gson().fromJson<List<IndividualityItem>>(list, type)
    }

    /**
     * NP Distribution
     */
    @TypeConverter
    fun fromIntList(list: List<Int?>?): String? {
        val type = object : TypeToken<List<Int>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toIntList(list: String?): List<Int>? {
        val type = object : TypeToken<List<Int>>() {}.type
        return Gson().fromJson<List<Int>>(list, type)
    }

    /**
     * Noble Phantasm item
     */
    @TypeConverter
    fun fromNoblePhantasmItem(list: List<NoblePhantasmItem?>?): String? {
        val type = object : TypeToken<List<NoblePhantasmItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toNoblePhantasmItem(list: String?): List<NoblePhantasmItem>? {
        val type = object : TypeToken<List<NoblePhantasmItem>>() {}.type
        return Gson().fromJson<List<NoblePhantasmItem>>(list, type)
    }

}