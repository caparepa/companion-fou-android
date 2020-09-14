package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.ScriptObj
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.data.model.nice.servant.*
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "servant",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
data class Servant(
    @PrimaryKey
    val id: Long? = null,
    val collection_no: Long? = null,
    val name: String? = null,
    val class_name: String? = null,
    val type: String? = null,
    val rarity: Int? = null,
    val cost: Int? = null,
    val lv_max: Int? = null,
    val extra_assets: String? = null,
    val gender: String? = null,
    val attribute: String? = null,
    val traits: String? = null,
    val star_absorb: Int? = null,
    val star_gen: Int? = null,
    val instant_death_chance: Int? = null,
    val cards: List<String?>? = null,
    val hits_distribution: String? = null,
    val atkBase: Int? = null,
    val atkMax: Int? = null,
    val hpBase: Int? = null,
    val hp_max: Int? = null,
    val growth_curve: Int? = null,
    val atk_growth: String? = null,
    val hp_growth: String? = null,
    val bond_growth: String? = null,
    val bond_equip: Int? = null,
    val ascension_materials: String? = null,
    val skill_materials: String? = null,
    val costume_materials: String? = null,
    val script: String? = null,
    val skills: String? = null,
    val class_passive: String? = null,
    val noble_phantasms: String? = null,
    val profile: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extra_assets?.toKotlinObject()
    }

    fun getTraits(): List<TraitItem>? {
        return this.traits?.toKotlinObject()
    }

    fun getHitsDistribution(): HitsDistribution? {
        return this.hits_distribution?.toKotlinObject()
    }

    fun getAtkGrowth(): List<Int>? {
        return this.atk_growth?.toKotlinObject()
    }

    fun getHpGrowth(): List<Int>? {
        return this.hp_growth?.toKotlinObject()
    }

    fun getBondGrowth(): List<Int>? {
        return this.bond_growth?.toKotlinObject()
    }

    fun getAscensionMaterials(): Materials? {
        return this.ascension_materials?.toKotlinObject()
    }

    fun getSkillMaterials(): Materials? {
        return this.skill_materials?.toKotlinObject()
    }

    fun getCostumeMaterials(): Materials? {
        return this.costume_materials?.toKotlinObject()
    }

    fun getScript(): ScriptObj? {
        return this.script?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }

    fun getClassPassives(): List<ClassPassiveItem>? {
        return this.class_passive?.toKotlinObject()
    }

    fun getNoblePhantasms(): List<NoblePhantasmItem>? {
        return this.noble_phantasms?.toKotlinObject()
    }

    fun getProfile(): ServantProfile? {
        return this.profile?.toKotlinObject()
    }
}