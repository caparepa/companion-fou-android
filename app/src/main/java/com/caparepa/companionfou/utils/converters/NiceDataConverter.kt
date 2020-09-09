package com.caparepa.companionfou.utils.converters

import androidx.room.TypeConverter
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

}