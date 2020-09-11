package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "servant_item",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
data class NiceServantItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("collectionNo")
    val collectionNo: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("className")
    val className: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("rarity")
    val rarity: Int?,
    @SerializedName("cost")
    val cost: Int?,
    @SerializedName("lvMax")
    val lvMax: Int?,
    @Embedded
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets?,
    @SerializedName("gender")
    val gender: String?,
    @SerializedName("attribute")
    val attribute: String?,
    @Embedded
    @SerializedName("traits")
    val traits: List<TraitItem?>?,
    @SerializedName("starAbsorb")
    val starAbsorb: Int?,
    @SerializedName("starGen")
    val starGen: Int?,
    @SerializedName("instantDeathChance")
    val instantDeathChance: Int?,
    @Embedded
    @SerializedName("cards")
    val cards: List<String?>?,
    @Embedded
    @SerializedName("hitsDistribution")
    val hitsDistribution: HitsDistribution?,
    @SerializedName("atkBase")
    val atkBase: Int?,
    @SerializedName("atkMax")
    val atkMax: Int?,
    @SerializedName("hpBase")
    val hpBase: Int?,
    @SerializedName("hpMax")
    val hpMax: Int?,
    @SerializedName("growthCurve")
    val growthCurve: Int?,
    @Embedded
    @SerializedName("atkGrowth")
    val atkGrowth: List<Int?>?,
    @Embedded
    @SerializedName("hpGrowth")
    val hpGrowth: List<Int?>?,
    @Embedded
    @SerializedName("bondGrowth")
    val bondGrowth: List<Int?>?,
    @SerializedName("bondEquip")
    val bondEquip: Int?,
    @Embedded(prefix = "ascension_mats_")
    @SerializedName("ascensionMaterials")
    val ascensionMaterials: Map<Int,Materials?>?,
    @Embedded(prefix = "skill_mats_")
    @SerializedName("skillMaterials")
    val skillMaterials: Map<Int,Materials?>?,
    @Embedded
    @SerializedName("skills")
    val skills: List<SkillItem?>?,
    @Embedded
    @SerializedName("classPassive")
    val classPassive: List<ClassPassiveItem?>?,
    @Embedded
    @SerializedName("noblePhantasms")
    val noblePhantasms: List<NoblePhantasmItem?>?,
    @Embedded
    @SerializedName("profile")
    val profile: ServantProfile?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}
