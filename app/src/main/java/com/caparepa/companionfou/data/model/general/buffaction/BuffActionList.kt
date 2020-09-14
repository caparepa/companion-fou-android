package com.caparepa.companionfou.data.model.general.buffaction

import com.google.gson.String
import com.google.gson.annotations.SerializedName

data class BuffActionList(
    @SerializedName("commandAtk")
    val commandAtk: String? = null,
    @SerializedName("commandDef")
    val commandDef: String? = null,
    @SerializedName("atk")
    val atk: String? = null,
    @SerializedName("defence")
    val defence: String? = null,
    @SerializedName("defencePierce")
    val defencePierce: String? = null,
    @SerializedName("specialdefence")
    val specialdefence: String? = null,
    @SerializedName("damage")
    val damage: String? = null,
    @SerializedName("damageIndividuality")
    val damageIndividuality: String? = null,
    @SerializedName("damageIndividualityActiveonly")
    val damageIndividualityActiveonly: String? = null,
    @SerializedName("selfdamage")
    val selfdamage: String? = null,
    @SerializedName("criticalDamage")
    val criticalDamage: String? = null,
    @SerializedName("npdamage")
    val npdamage: String? = null,
    @SerializedName("givenDamage")
    val givenDamage: String? = null,
    @SerializedName("receiveDamage")
    val receiveDamage: String? = null,
    @SerializedName("pierceInvincible")
    val pierceInvincible: String? = null,
    @SerializedName("invincible")
    val invincible: String? = null,
    @SerializedName("breakAvoidance")
    val breakAvoidance: String? = null,
    @SerializedName("avoidance")
    val avoidance: String? = null,
    @SerializedName("overwriteBattleclass")
    val overwriteBattleclass: String? = null,
    @SerializedName("overwriteClassrelatioAtk")
    val overwriteClassrelatioAtk: String? = null,
    @SerializedName("overwriteClassrelatioDef")
    val overwriteClassrelatioDef: String? = null,
    @SerializedName("commandNpAtk")
    val commandNpAtk: String? = null,
    @SerializedName("commandNpDef")
    val commandNpDef: String? = null,
    @SerializedName("dropNp")
    val dropNp: String? = null,
    @SerializedName("dropNpDamage")
    val dropNpDamage: String? = null,
    @SerializedName("commandStarAtk")
    val commandStarAtk: String? = null,
    @SerializedName("commandStarDef")
    val commandStarDef: String? = null,
    @SerializedName("criticalPoint")
    val criticalPoint: String? = null,
    @SerializedName("starweight")
    val starweight: String? = null,
    @SerializedName("turnendNp")
    val turnendNp: String? = null,
    @SerializedName("turnendStar")
    val turnendStar: String? = null,
    @SerializedName("turnendHpRegain")
    val turnendHpRegain: String? = null,
    @SerializedName("turnendHpReduce")
    val turnendHpReduce: String? = null,
    @SerializedName("gainHp")
    val gainHp: String? = null,
    @SerializedName("turnvalNp")
    val turnvalNp: String? = null,
    @SerializedName("grantState")
    val grantState: String? = null,
    @SerializedName("resistanceState")
    val resistanceState: String? = null,
    @SerializedName("avoidState")
    val avoidState: String? = null,
    @SerializedName("donotAct")
    val donotAct: String? = null,
    @SerializedName("donotSkill")
    val donotSkill: String? = null,
    @SerializedName("donotNoble")
    val donotNoble: String? = null,
    @SerializedName("donotRecovery")
    val donotRecovery: String? = null,
    @SerializedName("individualityAdd")
    val individualityAdd: String? = null,
    @SerializedName("individualitySub")
    val individualitySub: String? = null,
    @SerializedName("hate")
    val hate: String? = null,
    @SerializedName("criticalRate")
    val criticalRate: String? = null,
    @SerializedName("avoidInstantdeath")
    val avoidInstantdeath: String? = null,
    @SerializedName("resistInstantdeath")
    val resistInstantdeath: String? = null,
    @SerializedName("nonresistInstantdeath")
    val nonresistInstantdeath: String? = null,
    @SerializedName("regainNpUsedNoble")
    val regainNpUsedNoble: String? = null,
    @SerializedName("functionDead")
    val functionDead: String? = null,
    @SerializedName("maxhpRate")
    val maxhpRate: String? = null,
    @SerializedName("maxhpValue")
    val maxhpValue: String? = null,
    @SerializedName("functionWavestart")
    val functionWavestart: String? = null,
    @SerializedName("functionSelfturnend")
    val functionSelfturnend: String? = null,
    @SerializedName("giveGainHp")
    val giveGainHp: String? = null,
    @SerializedName("functionCommandattack")
    val functionCommandattack: String? = null,
    @SerializedName("functionDeadattack")
    val functionDeadattack: String? = null,
    @SerializedName("functionEntry")
    val functionEntry: String? = null,
    @SerializedName("chagetd")
    val chagetd: String? = null,
    @SerializedName("grantSubstate")
    val grantSubstate: String? = null,
    @SerializedName("toleranceSubstate")
    val toleranceSubstate: String? = null,
    @SerializedName("grantInstantdeath")
    val grantInstantdeath: String? = null,
    @SerializedName("functionDamage")
    val functionDamage: String? = null,
    @SerializedName("functionReflection")
    val functionReflection: String? = null,
    @SerializedName("multiattack")
    val multiattack: String? = null,
    @SerializedName("giveNp")
    val giveNp: String? = null,
    @SerializedName("resistanceDelayNpturn")
    val resistanceDelayNpturn: String? = null,
    @SerializedName("pierceDefence")
    val pierceDefence: String? = null,
    @SerializedName("gutsHp")
    val gutsHp: String? = null,
    @SerializedName("funcgainNp")
    val funcgainNp: String? = null,
    @SerializedName("funcHpReduce")
    val funcHpReduce: String? = null,
    @SerializedName("functionNpattack")
    val functionNpattack: String? = null,
    @SerializedName("fixCommandcard")
    val fixCommandcard: String? = null,
    @SerializedName("donotGainnp")
    val donotGainnp: String? = null,
    @SerializedName("fieldIndividuality")
    val fieldIndividuality: String? = null,
    @SerializedName("donotActCommandtype")
    val donotActCommandtype: String? = null,
    @SerializedName("damageEventPoint")
    val damageEventPoint: String? = null
)