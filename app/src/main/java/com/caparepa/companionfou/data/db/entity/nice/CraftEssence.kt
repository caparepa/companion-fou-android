package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "craft_essence",
    indices = [
        Index(value = ["collection_no"], unique = true)
    ]
)
data class CraftEssence(
    @PrimaryKey
    val id: Long? = null,
    val collection_no: Long? = null,
    val name: String? = null,
    val type: String? = null,
    val rarity: Int? = null,
    val cost: Int? = null,
    val lv_max: Int? = null,
    /** ExtraAssets? **/
    val extra_assets: JsonElement? = null,
    val atk_base: Int? = null,
    val atk_max: Int? = null,
    val hp_base: Int? = null,
    val hp_max: Int? = null,
    val growth_curve: Int? = null,
    /** List<Int?>? **/
    val atk_growth: JsonArray? = null,
    /** List<Int?>? **/
    val hp_growth: JsonArray? = null,
    /** List<SkillItem?>? **/
    val skills: JsonArray? = null
)