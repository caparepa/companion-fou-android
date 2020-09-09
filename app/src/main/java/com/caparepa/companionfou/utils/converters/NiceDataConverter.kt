package com.caparepa.companionfou.utils.converters

import androidx.room.TypeConverter
import com.caparepa.companionfou.data.db.entity.nice.servant.CommentItem
import com.caparepa.companionfou.data.db.entity.nice.servant.ProfileCostumeItem
import com.caparepa.companionfou.data.db.entity.nice.servant.VoiceLineCondItem
import com.caparepa.companionfou.data.db.entity.nice.servant.VoiceLineItem
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
    fun toVoiceLineItemList(list: List<VoiceLineItem?>?): String? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun fromVoiceLineItemList(list: String?): List<VoiceLineItem>? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().fromJson<List<VoiceLineItem>>(list, type)
    }

    /**
     * Comment item type converter
     */

    @TypeConverter
    fun toCommentItemList(list: List<CommentItem?>?): String? {
        val type = object : TypeToken<List<CommentItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun fromCommentItemList(list: String?): List<CommentItem>? {
        val type = object : TypeToken<List<CommentItem>>() {}.type
        return Gson().fromJson<List<CommentItem>>(list, type)
    }

    /**
     * Profile costume item
     */
    @TypeConverter
    fun toProfileCostumeItem(list: List<ProfileCostumeItem?>?): String? {
        val type = object : TypeToken<List<ProfileCostumeItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun fromProfileCostumeItem(list: String?): List<ProfileCostumeItem>? {
        val type = object : TypeToken<List<ProfileCostumeItem>>() {}.type
        return Gson().fromJson<List<ProfileCostumeItem>>(list, type)
    }

}