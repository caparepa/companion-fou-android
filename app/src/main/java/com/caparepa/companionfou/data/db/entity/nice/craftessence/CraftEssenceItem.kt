package com.caparepa.companionfou.data.db.entity.nice.craftessence

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.db.entity.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "nice_craft_essence",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
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
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets? = null,
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
    @SerializedName("skills")
    val skills: List<SkillItem?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mCraftId: Long = 0
}
