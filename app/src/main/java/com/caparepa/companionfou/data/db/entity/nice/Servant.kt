package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.servant.HitsDistribution
import com.caparepa.companionfou.data.model.nice.servant.Materials
import com.caparepa.companionfou.data.model.nice.servant.TraitItem
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
    @ColumnInfo(name = "collection_no")
    val collectionNo: Long? = null,
    val name: String? = null,
    @ColumnInfo(name = "class_name")
    val className: String? = null,
    val type: String? = null,
    val rarity: Int? = null,
    val cost: Int? = null,
    @ColumnInfo(name = "lv_max")
    val lvMax: Int? = null,
    @ColumnInfo(name = "extra_assets")
    val extraAssets: String? = null,
    val gender: String? = null,
    val attribute: String? = null,
    val traits: String? = null,
    @ColumnInfo(name = "star_absorb")
    val starAbsorb: Int? = null,
    @ColumnInfo(name = "star_gen")
    val starGen: Int? = null,
    @ColumnInfo(name = "instant_death_chance")
    val instantDeathChance: Int? = null,
    @ColumnInfo(name = "")
    val cards: List<String?>? = null,
    /** HitsDistribution? **/
    @ColumnInfo(name = "hits_distribution")
    val hitsDistribution: String? = null,
    @ColumnInfo(name = "atk_base")
    val atkBase: Int? = null,
    @ColumnInfo(name = "akt_max")
    val atkMax: Int? = null,
    @ColumnInfo(name = "hp_base")
    val hpBase: Int? = null,
    @ColumnInfo(name = "hp_max")
    val hpMax: Int? = null,
    @ColumnInfo(name = "growth_curve")
    val growthCurve: Int? = null,
    @ColumnInfo(name = "atk_growth")
    val atkGrowth: String? = null,
    @ColumnInfo(name = "hp_growth")
    val hpGrowth: String? = null,
    @ColumnInfo(name = "bond_growth")
    val bondGrowth: String? = null,
    @ColumnInfo(name = "bond_equip")
    val bondEquip: Int? = null,
    /** SkillMaterials? **/
    @ColumnInfo(name = "ascension_materials")
    val ascensionMaterials: String? = null,
    /** SkillMaterials? **/
    @ColumnInfo(name = "skill_materials")
    val skillMaterials: String? = null,
    /** List<SkillItem?>? **/
    @ColumnInfo(name = "skills")
    val skills: String? = null,
    /** List<ClassPassiveItem?>? **/
    @ColumnInfo(name = "class_passive")
    val classPassive: String? = null,
    /** List<NoblePhantasmItem?>? **/
    @ColumnInfo(name = "noble_phantasms")
    val noblePhantasms: String? = null,
    /** ServantProfile? **/
    val profile: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extraAssets?.toKotlinObject()
    }

    fun getTraits(): List<TraitItem>? {
        return this.traits?.toKotlinObject()
    }

    fun getHitsDistribution(): HitsDistribution? {
        return this.hitsDistribution?.toKotlinObject()
    }

    fun getAtkGrowth(): List<Int>? {
        return this.atkGrowth?.toKotlinObject()
    }

    fun getHpGrowth(): List<Int>? {
        return this.hpGrowth?.toKotlinObject()
    }

    fun getBondGrowth(): List<Int>? {
        return this.bondGrowth?.toKotlinObject()
    }

    fun getAscensionMaterials(): Materials? {
        return this.ascensionMaterials?.toKotlinObject()
    }

    fun getSkillMaterials(): Materials? {
        return this.skillMaterials?.toKotlinObject()
    }
}