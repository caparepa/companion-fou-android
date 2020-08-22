package com.caparepa.companionfou.data.model.nice.servant


import com.google.gson.annotations.SerializedName

data class ServantItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
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
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets? = null,
    @SerializedName("gender")
    val gender: String? = null,
    @SerializedName("attribute")
    val attribute: String? = null,
    @SerializedName("traits")
    val traits: List<Trait?>? = null,
    @SerializedName("starAbsorb")
    val starAbsorb: Int? = null,
    @SerializedName("starGen")
    val starGen: Int? = null,
    @SerializedName("instantDeathChance")
    val instantDeathChance: Int? = null,
    @SerializedName("cards")
    val cards: List<String?>? = null,
    @SerializedName("hitsDistribution")
    val hitsDistribution: HitsDistribution? = null,
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
    val atkGrowth: List<Int?>? = null,
    @SerializedName("hpGrowth")
    val hpGrowth: List<Int?>? = null,
    @SerializedName("bondGrowth")
    val bondGrowth: List<Any?>? = null,
    @SerializedName("bondEquip")
    val bondEquip: Int? = null,
    @SerializedName("ascensionMaterials")
    val ascensionMaterials: AscensionMaterials? = null,
    @SerializedName("skillMaterials")
    val skillMaterials: SkillMaterials? = null,
    @SerializedName("skills")
    val skills: List<Any?>? = null,
    @SerializedName("classPassive")
    val classPassive: List<Any?>? = null,
    @SerializedName("noblePhantasms")
    val noblePhantasms: List<NoblePhantasmItem?>? = null
) {
    data class ExtraAssets(
        @SerializedName("charaGraph")
        val charaGraph: CharaGraph? = null,
        @SerializedName("faces")
        val faces: Faces? = null,
        @SerializedName("narrowFigure")
        val narrowFigure: NarrowFigure? = null,
        @SerializedName("charaFigure")
        val charaFigure: CharaFigure? = null,
        @SerializedName("commands")
        val commands: Commands? = null,
        @SerializedName("status")
        val status: Status? = null,
        @SerializedName("equipFace")
        val equipFace: EquipFace? = null
    ) {
        data class CharaGraph(
            @SerializedName("ascension")
            val ascension: Map<Int, String?>? = null
        )

        data class Faces(
            @SerializedName("ascension")
            val ascension: Map<Int, String?>? = null
        )

        class NarrowFigure(
        )

        class CharaFigure(
        )

        class Commands(
        )

        class Status(
        )

        class EquipFace(
        )
    }

    data class Trait(
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null
    )

    data class HitsDistribution(
        @SerializedName("arts")
        val arts: List<Int?>? = null,
        @SerializedName("buster")
        val buster: List<Int?>? = null,
        @SerializedName("quick")
        val quick: List<Int?>? = null,
        @SerializedName("extra")
        val extra: List<Int?>? = null
    )

    class AscensionMaterials(
    )

    class SkillMaterials(
    )


}
