package com.caparepa.companionfou.data.model.nice.craftessence

import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class CraftEssenceItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("cost")
    val cost: Int? = null,
    @SerializedName("lvMax")
    val lvMax: Int? = null,
    /** ExtraAssets? **/
    @SerializedName("extraAssets")
    val extraAssets: JsonElement? = null,
    @SerializedName("atkBase")
    val atkBase: Int? = null,
    @SerializedName("atkMax")
    val atkMax: Int? = null,
    @SerializedName("hpBase")
    val hpBase: Int? = null,
    @SerializedName("hpMax")
    val hpMax: Int? = null,
    @SerializedName("growthCurve")
    val growthCurve: Int? = null,
    /** List<Int?>? **/
    @SerializedName("atkGrowth")
    val atkGrowth: JsonArray? = null,
    /** List<Int?>? **/
    @SerializedName("hpGrowth")
    val hpGrowth: JsonArray? = null,
    /** List<SkillItem?>? **/
    @SerializedName("skills")
    val skills: JsonArray? = null
)
