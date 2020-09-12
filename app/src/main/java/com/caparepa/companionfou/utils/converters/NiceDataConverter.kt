package com.caparepa.companionfou.utils.converters

import androidx.room.TypeConverter
import com.caparepa.companionfou.data.model.nice.common.*
import com.caparepa.companionfou.data.model.nice.servant.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object NiceDataConverter {

    /**
     * Voice lines converter
     */

    @TypeConverter
    @JvmStatic
    fun fromVoiceLineCondItemList(list: List<VoiceCondItem?>?): String? {
        val type = object : TypeToken<List<VoiceCondItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toVoiceLineCondItemList(list: String?): List<VoiceCondItem>? {
        val type = object : TypeToken<List<VoiceCondItem>>() {}.type
        return Gson().fromJson<List<VoiceCondItem>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromVoiceItemList(list: List<VoiceItem?>?): String? {
        val type = object : TypeToken<List<VoiceItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toVoiceItemList(list: String?): List<VoiceItem>? {
        val type = object : TypeToken<List<VoiceItem>>() {}.type
        return Gson().fromJson<List<VoiceItem>>(list, type)
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
    fun fromCostumeItemList(list: List<CostumeItem?>?): String? {
        val type = object : TypeToken<List<CostumeItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toCostumeItemList(list: String?): List<CostumeItem>? {
        val type = object : TypeToken<List<CostumeItem>>() {}.type
        return Gson().fromJson<List<CostumeItem>>(list, type)
    }

    /**
     * Base Sval Item
     */
    @TypeConverter
    @JvmStatic
    fun fromBaseSvalItemList(list: List<BaseSvalItem?>?): String? {
        val type = object : TypeToken<List<BaseSvalItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBaseSvalItemList(list: String?): List<BaseSvalItem>? {
        val type = object : TypeToken<List<BaseSvalItem>>() {}.type
        return Gson().fromJson<List<BaseSvalItem>>(list, type)
    }

    /**
     * CkSelfIndvItem and CkOpIndvItem
     */

    @TypeConverter
    @JvmStatic
    fun fromCkSelfIndvItemList(list: List<CkSelfIndvItem?>?): String? {
        val type = object : TypeToken<List<CkSelfIndvItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toCkSelfIndvItemList(list: String?): List<CkSelfIndvItem>? {
        val type = object : TypeToken<List<CkSelfIndvItem>>() {}.type
        return Gson().fromJson<List<CkSelfIndvItem>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromCkOpIndvItemList(list: List<CkOpIndvItem?>?): String? {
        val type = object : TypeToken<List<CkOpIndvItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toCkOpIndvItemList(list: String?): List<CkOpIndvItem>? {
        val type = object : TypeToken<List<CkOpIndvItem>>() {}.type
        return Gson().fromJson<List<CkOpIndvItem>>(list, type)
    }

    /**
     * BuffValItem
     */
    @TypeConverter
    @JvmStatic
    fun fromBaseValItemList(list: List<BaseValItem?>?): String? {
        val type = object : TypeToken<List<BaseValItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBaseValItemList(list: String?): List<BaseValItem>? {
        val type = object : TypeToken<List<BaseValItem>>() {}.type
        return Gson().fromJson<List<BaseValItem>>(list, type)
    }

    /**
     * BuffItem
     */
    @TypeConverter
    @JvmStatic
    fun fromBuffItemList(list: List<BuffItem?>?): String? {
        val type = object : TypeToken<List<BuffItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toBuffItemList(list: String?): List<BuffItem>? {
        val type = object : TypeToken<List<BuffItem>>() {}.type
        return Gson().fromJson<List<BuffItem>>(list, type)
    }

    /**
     * Function item
     */
    @TypeConverter
    @JvmStatic
    fun fromFunctionItemList(list: List<FunctionItem?>?): String? {
        val type = object : TypeToken<List<FunctionItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toFunctionItemList(list: String?): List<FunctionItem>? {
        val type = object : TypeToken<List<FunctionItem>>() {}.type
        return Gson().fromJson<List<FunctionItem>>(list, type)
    }

    /**
     * Individuality item
     */
    @TypeConverter
    @JvmStatic
    fun fromIndividualityItemList(list: List<IndividualityItem?>?): String? {
        val type = object : TypeToken<List<IndividualityItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIndividualityItemList(list: String?): List<IndividualityItem>? {
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
    fun fromNoblePhantasmItemList(list: List<NoblePhantasmItem?>?): String? {
        val type = object : TypeToken<List<NoblePhantasmItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toNoblePhantasmItemList(list: String?): List<NoblePhantasmItem>? {
        val type = object : TypeToken<List<NoblePhantasmItem>>() {}.type
        return Gson().fromJson<List<NoblePhantasmItem>>(list, type)
    }

    /**
     * Skill item
     */

    @TypeConverter
    @JvmStatic
    fun fromSkillItemList(list: List<SkillItem?>?): String? {
        val type = object : TypeToken<List<SkillItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toSkillItemList(list: String?): List<SkillItem>? {
        val type = object : TypeToken<List<SkillItem>>() {}.type
        return Gson().fromJson<List<SkillItem>>(list, type)
    }

    /**
     * Materials
     */
    @TypeConverter
    @JvmStatic
    fun fromMaterialItemList(list: List<MaterialItem?>?): String? {
        val type = object : TypeToken<List<MaterialItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toMaterialItemList(list: String?): List<MaterialItem>? {
        val type = object : TypeToken<List<MaterialItem>>() {}.type
        return Gson().fromJson<List<MaterialItem>>(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromIntMaterialsMap(map: Map<Int, MaterialItem?>?): String? {
        val type = object : TypeToken<Map<Int, MaterialItem>>() {}.type
        return Gson().toJson(map, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIntMaterialItemMap(map: String?): Map<Int, MaterialItem>? {
        val type = object : TypeToken<Map<Int, MaterialItem>>() {}.type
        return Gson().fromJson<Map<Int, MaterialItem>>(map, type)
    }

    /**
     * Traits
     */
    @TypeConverter
    @JvmStatic
    fun fromTraitItemList(list: List<TraitItem?>?): String? {
        val type = object : TypeToken<List<TraitItem>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    @JvmStatic
    fun toTraitItemList(list: String?): List<TraitItem>? {
        val type = object : TypeToken<List<TraitItem>>() {}.type
        return Gson().fromJson<List<TraitItem>>(list, type)
    }

    /**
     * Assets
     */
    @TypeConverter
    @JvmStatic
    fun fromIntStringMap(map: Map<Int, String?>?): String? {
        val type = object : TypeToken<Map<Int, String>>() {}.type
        return Gson().toJson(map, type)
    }

    @TypeConverter
    @JvmStatic
    fun toIntStringMap(map: String?): Map<Int, String>? {
        val type = object : TypeToken<Map<Int, String>>() {}.type
        return Gson().fromJson<Map<Int, String>>(map, type)
    }

    @TypeConverter
    @JvmStatic
    fun fromExtraAssets(obj: ExtraAssets?): String? {
        val type = object : TypeToken<ExtraAssets>() {}.type
        return Gson().toJson(obj, type)
    }

    @TypeConverter
    @JvmStatic
    fun toExtraAssets(obj: String?): ExtraAssets? {
        val type = object : TypeToken<ExtraAssets>() {}.type
        return Gson().fromJson<ExtraAssets>(obj, type)
    }
}