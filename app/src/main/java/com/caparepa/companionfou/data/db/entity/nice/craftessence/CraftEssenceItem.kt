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
    val id: Long?,
    @SerializedName("collectionNo")
    val collectionNo: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("rarity")
    val rarity: Int?,
    @SerializedName("cost")
    val cost: Int?,
    @SerializedName("lvMax")
    val lvMax: Int?,
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets?,
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
    @SerializedName("atkGrowth")
    val atkGrowth: List<Int?>?,
    @SerializedName("hpGrowth")
    val hpGrowth: List<Int?>?,
    @SerializedName("skills")
    val skills: List<SkillItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var mCraftId: Long = 0
}
