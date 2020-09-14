package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toKotlinObject

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
    val extra_assets: String? = null,
    val atk_base: Int? = null,
    val atk_max: Int? = null,
    val hp_base: Int? = null,
    val hp_max: Int? = null,
    val growth_curve: Int? = null,
    /** List<Int?>? **/
    val atk_growth: String? = null,
    /** List<Int?>? **/
    val hp_growth: String? = null,
    /** List<SkillItem?>? **/
    val skills: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extra_assets?.toKotlinObject()
    }

    fun getAtkGrowth(): List<Int>? {
        return this.atk_growth?.toKotlinObject()
    }

    fun getHpGrowth(): List<Int>? {
        return this.hp_growth?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }
}