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
    @JvmStatic
    fun fromVoiceLineCondItemList(list: List<VoiceLineCondItem?>?): String? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toVoiceLineCondItemList(list: String?): List<VoiceLineCondItem>? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().fromJson<List<VoiceLineCondItem>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromVoiceLineItemList(list: List<VoiceLineItem?>?): String? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toVoiceLineItemList(list: String?): List<VoiceLineItem>? {
        val type = object : TypeToken<List<VoiceLineCondItem>>() {}.type
        return Gson().fromJson<List<VoiceLineItem>>(list, type)
    }

    /**
     * Comment item type converter
     */

    @TypeConverter
    @JvmStatic
    fun fromCommentItemList(list: List<CommentItem?>?): String? {
        val type = object : TypeToken<List<CommentItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toCommentItemList(list: String?): List<CommentItem>? {
        val type = object : TypeToken<List<CommentItem>>() {}.type
        return Gson().fromJson<List<CommentItem>>(list, type)
    }

    /**
     * Profile costume item
     */
    @TypeConverter
    @JvmStatic
    fun fromProfileCostumeItem(list: List<ProfileCostumeItem?>?): String? {
        val type = object : TypeToken<List<ProfileCostumeItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toProfileCostumeItem(list: String?): List<ProfileCostumeItem>? {
        val type = object : TypeToken<List<ProfileCostumeItem>>() {}.type
        return Gson().fromJson<List<ProfileCostumeItem>>(list, type)
    }

    /**
     * Base Sval Item
     */
    @TypeConverter
    @JvmStatic
    fun fromBaseSvalItem(list: List<BaseSvalItem?>?): String? {
        val type = object : TypeToken<List<BaseSvalItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBaseSvalItem(list: String?): List<BaseSvalItem>? {
        val type = object : TypeToken<List<BaseSvalItem>>() {}.type
        return Gson().fromJson<List<BaseSvalItem>>(list, type)
    }

    /**
     * CkSelfIndvItem and CkOpIndvItem
     */

    @TypeConverter
    @JvmStatic
    fun fromCkSelfIndvItem(list: List<CkSelfIndvItem?>?): String? {
        val type = object : TypeToken<List<CkSelfIndvItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toCkSelfIndvItem(list: String?): List<CkSelfIndvItem>? {
        val type = object : TypeToken<List<CkSelfIndvItem>>() {}.type
        return Gson().fromJson<List<CkSelfIndvItem>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromCkOpIndvItem(list: List<CkOpIndvItem?>?): String? {
        val type = object : TypeToken<List<CkOpIndvItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toCkOpIndvItem(list: String?): List<CkOpIndvItem>? {
        val type = object : TypeToken<List<CkOpIndvItem>>() {}.type
        return Gson().fromJson<List<CkOpIndvItem>>(list, type)
    }

    /**
     * BuffValItem
     */
    @TypeConverter
    @JvmStatic
    fun fromBuffValItem(list: List<BuffValItem?>?): String? {
        val type = object : TypeToken<List<BuffValItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBuffValItem(list: String?): List<BuffValItem>? {
        val type = object : TypeToken<List<BuffValItem>>() {}.type
        return Gson().fromJson<List<BuffValItem>>(list, type)
    }

    /**
     * BuffItem
     */
    @TypeConverter
    @JvmStatic
    fun fromBuffItem(list: List<BuffItem?>?): String? {
        val type = object : TypeToken<List<BuffItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBuffItem(list: String?): List<BuffItem>? {
        val type = object : TypeToken<List<BuffItem>>() {}.type
        return Gson().fromJson<List<BuffItem>>(list, type)
    }

    /**
     * Function item
     */
    @TypeConverter
    @JvmStatic
    fun fromFunctionItem(list: List<FunctionItem?>?): String? {
        val type = object : TypeToken<List<FunctionItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toFunctionItem(list: String?): List<FunctionItem>? {
        val type = object : TypeToken<List<FunctionItem>>() {}.type
        return Gson().fromJson<List<FunctionItem>>(list, type)
    }

    /**
     * Individuality item
     */
    @TypeConverter
    @JvmStatic
    fun fromIndividualityItem(list: List<IndividualityItem?>?): String? {
        val type = object : TypeToken<List<IndividualityItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIndividualityItem(list: String?): List<IndividualityItem>? {
        val type = object : TypeToken<List<IndividualityItem>>() {}.type
        return Gson().fromJson<List<IndividualityItem>>(list, type)
    }

    /**
     * Primitives
     */
    @TypeConverter
    @JvmStatic
    fun fromIntList(list: List<Int?>?): String? {
        val type = object : TypeToken<List<Int>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIntList(list: String?): List<Int>? {
        val type = object : TypeToken<List<Int>>() {}.type
        return Gson().fromJson<List<Int>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromStringList(list: List<String?>?): String? {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toStringList(list: String?): List<String>? {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson<List<String>>(list, type)
    }

    /**
     * Noble Phantasm item
     */
    @TypeConverter
    @JvmStatic
    fun fromNoblePhantasmItem(list: List<NoblePhantasmItem?>?): String? {
        val type = object : TypeToken<List<NoblePhantasmItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toNoblePhantasmItem(list: String?): List<NoblePhantasmItem>? {
        val type = object : TypeToken<List<NoblePhantasmItem>>() {}.type
        return Gson().fromJson<List<NoblePhantasmItem>>(list, type)
    }

    /**
     * Skill item
     */

    @TypeConverter
    @JvmStatic
    fun fromSkillItem(list: List<SkillItem?>?): String? {
        val type = object : TypeToken<List<SkillItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toSkillItem(list: String?): List<SkillItem>? {
        val type = object : TypeToken<List<SkillItem>>() {}.type
        return Gson().fromJson<List<SkillItem>>(list, type)
    }

    /**
     * Materials
     */
    @TypeConverter
    @JvmStatic
    fun fromBaseMaterialItem(list: List<BaseMaterialItem?>?): String? {
        val type = object : TypeToken<List<BaseMaterialItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBaseMaterialItem(list: String?): List<BaseMaterialItem>? {
        val type = object : TypeToken<List<BaseMaterialItem>>() {}.type
        return Gson().fromJson<List<BaseMaterialItem>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromIntMaterialsMap(map: Map<Int,Materials?>?): String? {
        val type = object : TypeToken<Map<Int,Materials>>() {}.type
        return Gson().toJson(map, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIntMaterialsMap(map: String?): Map<Int,Materials>? {
        val type = object : TypeToken<Map<Int,Materials>>() {}.type
        return Gson().fromJson<Map<Int,Materials>>(map, type)
    }

    /**
     * Traits
     */
    @TypeConverter
    @JvmStatic
    fun fromTraitItem(list: List<TraitItem?>?): String? {
        val type = object : TypeToken<List<TraitItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toTraitItem(list: String?): List<TraitItem>? {
        val type = object : TypeToken<List<TraitItem>>() {}.type
        return Gson().fromJson<List<TraitItem>>(list, type)
    }

    /**
     * Assets
     */
    @TypeConverter
    @JvmStatic
    fun fromIntStringMap(map: Map<Int,String?>?): String? {
        val type = object : TypeToken<Map<Int,String>>() {}.type
        return Gson().toJson(map, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIntStringMap(map: String?): Map<Int,String>? {
        val type = object : TypeToken<Map<Int,String>>() {}.type
        return Gson().fromJson<Map<Int,String>>(map, type)
    }
}