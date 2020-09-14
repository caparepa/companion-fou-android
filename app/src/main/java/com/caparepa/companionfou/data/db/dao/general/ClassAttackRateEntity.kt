package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "class_attack_rate"
)
data class ClassAttackRateEntity(
    val saber: Int? = null,
    val archer: Int? = null,
    val lancer: Int? = null,
    val rider: Int? = null,
    val caster: Int? = null,
    val assassin: Int? = null,
    val berserker: Int? = null,
    val shielder: Int? = null,
    val ruler: Int? = null,
    val alter_ego: Int? = null,
    val avenger: Int? = null,
    val demon_god_pillar: Int? = null,
    val grand_caster: Int? = null,
    val beast_ii: Int? = null,
    val beast_i: Int? = null,
    val moon_cancer: Int? = null,
    val beast_iii_r: Int? = null,
    val foreigner: Int? = null,
    val bear_iii_l: Int? = null,
    val beast_unknown: Int? = null,
    val unknown: Int? = null,
    val all: Int? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}