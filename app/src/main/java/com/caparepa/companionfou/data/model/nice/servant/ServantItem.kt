package com.caparepa.companionfou.data.model.nice.servant

import com.caparepa.companionfou.data.model.common.ExtraAssets
import com.caparepa.companionfou.data.model.common.SkillItem
import com.google.gson.JsonArray

import com.google.gson.annotations.SerializedName

data class ServantItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("className")
    val className: String? = null,
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
    val extraAssets: String? = null,
    @SerializedName("gender")
    val gender: String? = null,
    @SerializedName("attribute")
    val attribute: String? = null,
    /** List<TraitItem?>? **/
    @SerializedName("traits")
    val traits: JsonArray? = null,
    @SerializedName("starAbsorb")
    val starAbsorb: Int? = null,
    @SerializedName("starGen")
    val starGen: Int? = null,
    @SerializedName("instantDeathChance")
    val instantDeathChance: Int? = null,
    @SerializedName("cards")
    val cards: List<String?>? = null,
    /** HitsDistribution? **/
    @SerializedName("hitsDistribution")
    val hitsDistribution: String? = null,
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
    @SerializedName("atkGrowth")
    /** List<Int?>? **/
    val atkGrowth: JsonArray? = null,
    @SerializedName("hpGrowth")
    /** List<Int?>? **/
    val hpGrowth: JsonArray? = null,
    /** List<Int?>? **/
    @SerializedName("bondGrowth")
    val bondGrowth: JsonArray? = null,
    @SerializedName("bondEquip")
    val bondEquip: Int? = null,
    /** SkillMaterials? **/
    @SerializedName("ascensionMaterials")
    val ascensionMaterials: String? = null,
    /** SkillMaterials? **/
    @SerializedName("skillMaterials")
    val skillMaterials: String? = null,
    /** SkillMaterials? **/
    @SerializedName("costumeMaterials")
    val costumeMaterials: String? = null,
    /** Script? **/
    @SerializedName("script")
    val script: String? = null,
    /** List<SkillItem?>? **/
    @SerializedName("skills")
    val skills: JsonArray? = null,
    /** List<ClassPassiveItem?>? **/
    @SerializedName("classPassive")
    val classPassive: JsonArray? = null,
    /** List<NoblePhantasmItem?>? **/
    @SerializedName("noblePhantasms")
    val noblePhantasms: JsonArray? = null,
    /** ServantProfile? **/
    @SerializedName("profile")
    val profile: String? = null
)
