package com.caparepa.companionfou.data.db.dao.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "class_attack_rate"
)
data class ClassAttackRateEntity(
    @ColumnInfo(name ="saber")
    val saber: Int? = null,
    @ColumnInfo(name ="archer")
    val archer: Int? = null,
    @ColumnInfo(name ="lancer")
    val lancer: Int? = null,
    @ColumnInfo(name ="rider")
    val rider: Int? = null,
    @ColumnInfo(name ="caster")
    val caster: Int? = null,
    @ColumnInfo(name ="assassin")
    val assassin: Int? = null,
    @ColumnInfo(name ="berserker")
    val berserker: Int? = null,
    @ColumnInfo(name ="shielder")
    val shielder: Int? = null,
    @ColumnInfo(name ="ruler")
    val ruler: Int? = null,
    @ColumnInfo(name ="alter_ego")
    val alterEgo: Int? = null,
    @ColumnInfo(name ="avenger")
    val avenger: Int? = null,
    @ColumnInfo(name ="demon_god_pillar")
    val demonGodPillar: Int? = null,
    @ColumnInfo(name ="grand_caster")
    val grandCaster: Int? = null,
    @ColumnInfo(name ="beast_ii")
    val beastII: Int? = null,
    @ColumnInfo(name ="beast_i")
    val beastI: Int? = null,
    @ColumnInfo(name ="moon_cancer")
    val moonCancer: Int? = null,
    @ColumnInfo(name ="beast_iii_r")
    val beastIIIR: Int? = null,
    @ColumnInfo(name ="foreigner")
    val foreigner: Int? = null,
    @ColumnInfo(name ="beast_iii_l")
    val beastIIIL: Int? = null,
    @ColumnInfo(name ="beast_unknown")
    val beastUnknown: Int? = null,
    @ColumnInfo(name ="unknown")
    val unknown: Int? = null,
    @ColumnInfo(name ="all")
    val all: Int? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}