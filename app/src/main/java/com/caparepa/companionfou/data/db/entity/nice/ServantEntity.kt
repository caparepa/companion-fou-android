package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.common.ExtraAssets
import com.caparepa.companionfou.data.model.common.ScriptObj
import com.caparepa.companionfou.data.model.common.SkillItem
import com.caparepa.companionfou.data.model.nice.servant.*
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "servant",
    indices = [
        Index(value = ["collection_no"], unique = true)
    ]
)
data class ServantEntity(
    @PrimaryKey
    @ColumnInfo(name ="id")
    val id: Long? = null,
    @ColumnInfo(name ="collection_no")
    val collectionNo: Long? = null,
    @ColumnInfo(name ="name")
    val name: String? = null,
    @ColumnInfo(name ="class_name")
    val className: String? = null,
    @ColumnInfo(name ="type")
    val type: String? = null,
    @ColumnInfo(name ="rarity")
    val rarity: Int? = null,
    @ColumnInfo(name ="cost")
    val cost: Int? = null,
    @ColumnInfo(name ="lv_max")
    val lvMax: Int? = null,
    /** ExtraAssets? **/
    @ColumnInfo(name ="extra_assets")
    val extraAssets: String? = null,
    @ColumnInfo(name ="gender")
    val gender: String? = null,
    @ColumnInfo(name ="attribute")
    val attribute: String? = null,
    /** List<TraitItem?>? **/
    @ColumnInfo(name ="traits")
    val traits: String? = null,
    @ColumnInfo(name ="star_absorb")
    val starAbsorb: Int? = null,
    @ColumnInfo(name ="star_gen")
    val starGen: Int? = null,
    @ColumnInfo(name ="instant_death_chance")
    val instantDeathChance: Int? = null,
    @ColumnInfo(name ="cards")
    val cards: String? = null,
    /** HitsDistribution? **/
    @ColumnInfo(name ="hits_distribution")
    val hitsDistribution: String? = null,
    @ColumnInfo(name ="atk_base")
    val atkBase: Int? = null,
    @ColumnInfo(name ="atk_max")
    val atkMax: Int? = null,
    @ColumnInfo(name ="hp_base")
    val hpBase: Int? = null,
    @ColumnInfo(name ="hp_max")
    val hpMax: Int? = null,
    @ColumnInfo(name ="growth_curve")
    val growthCurve: Int? = null,
    @ColumnInfo(name ="atk_growth")
    /** List<Int?>? **/
    val atkGrowth: String? = null,
    @ColumnInfo(name ="hp_growth")
    /** List<Int?>? **/
    val hpGrowth: String? = null,
    /** List<Int?>? **/
    @ColumnInfo(name ="bond_growth")
    val bondGrowth: String? = null,
    @ColumnInfo(name ="bond_equip")
    val bondEquip: Int? = null,
    /** SkillMaterials? **/
    @ColumnInfo(name ="ascension_materials")
    val ascensionMaterials: String? = null,
    /** SkillMaterials? **/
    @ColumnInfo(name ="skill_materials")
    val skillMaterials: String? = null,
    /** SkillMaterials? **/
    @ColumnInfo(name ="costume_materials")
    val costumeMaterials: String? = null,
    /** Script? **/
    @ColumnInfo(name ="script")
    val script: String? = null,
    /** List<SkillItem?>? **/
    @ColumnInfo(name ="skills")
    val skills: String? = null,
    /** List<ClassPassiveItem?>? **/
    @ColumnInfo(name ="class_passive")
    val classPassive: String? = null,
    /** List<NoblePhantasmItem?>? **/
    @ColumnInfo(name ="noble_phantasms")
    val noblePhantasms: String? = null,
    /** ServantProfile? **/
    @ColumnInfo(name ="profile")
    val profile: String? = null
) {
    fun getExtraAssetsObj(): ExtraAssets? {
        return this.extraAssets?.toKotlinObject()
    }

    fun getTraitsObj(): List<TraitItem>? {
        return this.traits?.toKotlinObject()
    }

    fun getFaceCardsObj(): List<String>? {
        return this.cards?.toKotlinObject()
    }

    fun getHitsDistributionObj(): HitsDistribution? {
        return this.hitsDistribution?.toKotlinObject()
    }

    fun getAtkGrowthObj(): List<Int>? {
        return this.atkGrowth?.toKotlinObject()
    }

    fun getHpGrowthObj(): List<Int>? {
        return this.hpGrowth?.toKotlinObject()
    }

    fun getBondGrowthObj(): List<Int>? {
        return this.bondGrowth?.toKotlinObject()
    }

    fun getAscensionMaterialsObj(): Materials? {
        return this.ascensionMaterials?.toKotlinObject()
    }

    fun getSkillMaterialsObj(): Materials? {
        return this.skillMaterials?.toKotlinObject()
    }

    fun getCostumeMaterialsObj(): Materials? {
        return this.costumeMaterials?.toKotlinObject()
    }

    fun getScriptObj(): ScriptObj? {
        return this.script?.toKotlinObject()
    }

    fun getSkillsObj(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }

    fun getClassPassivesObj(): List<ClassPassiveItem>? {
        return this.classPassive?.toKotlinObject()
    }

    fun getNoblePhantasmsObj(): List<NoblePhantasmItem>? {
        return this.noblePhantasms?.toKotlinObject()
    }

    fun getProfileObj(): ServantProfile? {
        return this.profile?.toKotlinObject()
    }
}