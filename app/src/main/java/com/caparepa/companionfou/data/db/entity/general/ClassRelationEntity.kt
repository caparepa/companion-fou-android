package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationDetail
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "class_relation"
)
data class ClassRelationEntity(
    @ColumnInfo(name = "server")
    val server: String? = null,
    @ColumnInfo(name = "saber")
    val saber: String? = null,
    @ColumnInfo(name = "archer")
    val archer: String? = null,
    @ColumnInfo(name = "lancer")
    val lancer: String? = null,
    @ColumnInfo(name = "rider")
    val rider: String? = null,
    @ColumnInfo(name = "caster")
    val caster: String? = null,
    @ColumnInfo(name = "assassin")
    val assassin: String? = null,
    @ColumnInfo(name = "berserker")
    val berserker: String? = null,
    @ColumnInfo(name = "shielder")
    val shielder: String? = null,
    @ColumnInfo(name = "ruler")
    val ruler: String? = null,
    @ColumnInfo(name = "alter_ego")
    val alterEgo: String? = null,
    @ColumnInfo(name = "avenger")
    val avenger: String? = null,
    @ColumnInfo(name = "demon_god_pillar")
    val demonGodPillar: String? = null,
    @ColumnInfo(name = "beast_ii")
    val beastII: String? = null,
    @ColumnInfo(name = "beast_i")
    val beastI: String? = null,
    @ColumnInfo(name = "moon_cancer")
    val moonCancer: String? = null,
    @ColumnInfo(name = "beast_iii_r")
    val beastIIIR: String? = null,
    @ColumnInfo(name = "foreigner")
    val foreigner: String? = null,
    @ColumnInfo(name = "beast_iii_l")
    val beastIIIL: String? = null,
    @ColumnInfo(name = "beast_unknown")
    val beastUnknown: String? = null
) {
    @ColumnInfo(name = "table_id")
    @PrimaryKey(autoGenerate = true)
    var tableId: Long = 0

    fun String.getClassRelationDetail(): ClassRelationDetail? {
        return this.toKotlinObject()
    }
}