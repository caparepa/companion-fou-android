package com.caparepa.companionfou.data.model.common.nice.general.buffaction


import com.google.gson.annotations.SerializedName

data class BuffActionList(
    @SerializedName("commandAtk")
    val commandAtk: BuffActionParams? = null,
    @SerializedName("commandDef")
    val commandDef: BuffActionParams? = null,
    @SerializedName("atk")
    val atk: BuffActionParams? = null,
    @SerializedName("defence")
    val defence: BuffActionParams? = null,
    @SerializedName("defencePierce")
    val defencePierce: BuffActionParams? = null,
    @SerializedName("specialdefence")
    val specialdefence: BuffActionParams? = null,
    @SerializedName("damage")
    val damage: BuffActionParams? = null,
    @SerializedName("damageIndividuality")
    val damageIndividuality: BuffActionParams? = null,
    @SerializedName("damageIndividualityActiveonly")
    val damageIndividualityActiveonly: BuffActionParams? = null,
    @SerializedName("selfdamage")
    val selfdamage: BuffActionParams? = null,
    @SerializedName("criticalDamage")
    val criticalDamage: BuffActionParams? = null,
    @SerializedName("npdamage")
    val npdamage: BuffActionParams? = null,
    @SerializedName("givenDamage")
    val givenDamage: BuffActionParams? = null,
    @SerializedName("receiveDamage")
    val receiveDamage: BuffActionParams? = null,
    @SerializedName("pierceInvincible")
    val pierceInvincible: BuffActionParams? = null,
    @SerializedName("invincible")
    val invincible: BuffActionParams? = null,
    @SerializedName("breakAvoidance")
    val breakAvoidance: BuffActionParams? = null,
    @SerializedName("avoidance")
    val avoidance: BuffActionParams? = null,
    @SerializedName("overwriteBattleclass")
    val overwriteBattleclass: BuffActionParams? = null,
    @SerializedName("overwriteClassrelatioAtk")
    val overwriteClassrelatioAtk: BuffActionParams? = null,
    @SerializedName("overwriteClassrelatioDef")
    val overwriteClassrelatioDef: BuffActionParams? = null,
    @SerializedName("commandNpAtk")
    val commandNpAtk: BuffActionParams? = null,
    @SerializedName("commandNpDef")
    val commandNpDef: BuffActionParams? = null,
    @SerializedName("dropNp")
    val dropNp: BuffActionParams? = null,
    @SerializedName("dropNpDamage")
    val dropNpDamage: BuffActionParams? = null,
    @SerializedName("commandStarAtk")
    val commandStarAtk: BuffActionParams? = null,
    @SerializedName("commandStarDef")
    val commandStarDef: BuffActionParams? = null,
    @SerializedName("criticalPoint")
    val criticalPoint: BuffActionParams? = null,
    @SerializedName("starweight")
    val starweight: BuffActionParams? = null,
    @SerializedName("turnendNp")
    val turnendNp: BuffActionParams? = null,
    @SerializedName("turnendStar")
    val turnendStar: BuffActionParams? = null,
    @SerializedName("turnendHpRegain")
    val turnendHpRegain: BuffActionParams? = null,
    @SerializedName("turnendHpReduce")
    val turnendHpReduce: BuffActionParams? = null,
    @SerializedName("gainHp")
    val gainHp: BuffActionParams? = null,
    @SerializedName("turnvalNp")
    val turnvalNp: BuffActionParams? = null,
    @SerializedName("grantState")
    val grantState: BuffActionParams? = null,
    @SerializedName("resistanceState")
    val resistanceState: BuffActionParams? = null,
    @SerializedName("avoidState")
    val avoidState: BuffActionParams? = null,
    @SerializedName("donotAct")
    val donotAct: BuffActionParams? = null,
    @SerializedName("donotSkill")
    val donotSkill: BuffActionParams? = null,
    @SerializedName("donotNoble")
    val donotNoble: BuffActionParams? = null,
    @SerializedName("donotRecovery")
    val donotRecovery: BuffActionParams? = null,
    @SerializedName("individualityAdd")
    val individualityAdd: BuffActionParams? = null,
    @SerializedName("individualitySub")
    val individualitySub: BuffActionParams? = null,
    @SerializedName("hate")
    val hate: BuffActionParams? = null,
    @SerializedName("criticalRate")
    val criticalRate: BuffActionParams? = null,
    @SerializedName("avoidInstantdeath")
    val avoidInstantdeath: BuffActionParams? = null,
    @SerializedName("resistInstantdeath")
    val resistInstantdeath: BuffActionParams? = null,
    @SerializedName("nonresistInstantdeath")
    val nonresistInstantdeath: BuffActionParams? = null,
    @SerializedName("regainNpUsedNoble")
    val regainNpUsedNoble: BuffActionParams? = null,
    @SerializedName("functionDead")
    val functionDead: BuffActionParams? = null,
    @SerializedName("maxhpRate")
    val maxhpRate: BuffActionParams? = null,
    @SerializedName("maxhpValue")
    val maxhpValue: BuffActionParams? = null,
    @SerializedName("functionWavestart")
    val functionWavestart: BuffActionParams? = null,
    @SerializedName("functionSelfturnend")
    val functionSelfturnend: BuffActionParams? = null,
    @SerializedName("giveGainHp")
    val giveGainHp: BuffActionParams? = null,
    @SerializedName("functionCommandattack")
    val functionCommandattack: BuffActionParams? = null,
    @SerializedName("functionDeadattack")
    val functionDeadattack: BuffActionParams? = null,
    @SerializedName("functionEntry")
    val functionEntry: BuffActionParams? = null,
    @SerializedName("chagetd")
    val chagetd: BuffActionParams? = null,
    @SerializedName("grantSubstate")
    val grantSubstate: BuffActionParams? = null,
    @SerializedName("toleranceSubstate")
    val toleranceSubstate: BuffActionParams? = null,
    @SerializedName("grantInstantdeath")
    val grantInstantdeath: BuffActionParams? = null,
    @SerializedName("functionDamage")
    val functionDamage: BuffActionParams? = null,
    @SerializedName("functionReflection")
    val functionReflection: BuffActionParams? = null,
    @SerializedName("multiattack")
    val multiattack: BuffActionParams? = null,
    @SerializedName("giveNp")
    val giveNp: BuffActionParams? = null,
    @SerializedName("resistanceDelayNpturn")
    val resistanceDelayNpturn: BuffActionParams? = null,
    @SerializedName("pierceDefence")
    val pierceDefence: BuffActionParams? = null,
    @SerializedName("gutsHp")
    val gutsHp: BuffActionParams? = null,
    @SerializedName("funcgainNp")
    val funcgainNp: BuffActionParams? = null,
    @SerializedName("funcHpReduce")
    val funcHpReduce: BuffActionParams? = null,
    @SerializedName("functionNpattack")
    val functionNpattack: BuffActionParams? = null,
    @SerializedName("fixCommandcard")
    val fixCommandcard: BuffActionParams? = null,
    @SerializedName("donotGainnp")
    val donotGainnp: BuffActionParams? = null,
    @SerializedName("fieldIndividuality")
    val fieldIndividuality: BuffActionParams? = null,
    @SerializedName("donotActCommandtype")
    val donotActCommandtype: BuffActionParams? = null,
    @SerializedName("damageEventPoint")
    val damageEventPoint: BuffActionParams? = null
)