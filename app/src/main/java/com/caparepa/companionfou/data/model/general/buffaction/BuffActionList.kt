package com.caparepa.companionfou.data.model.general.buffaction


import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class BuffActionList(
    @SerializedName("commandAtk")
    val commandAtk: JsonElement? = null,
    @SerializedName("commandDef")
    val commandDef: JsonElement? = null,
    @SerializedName("atk")
    val atk: JsonElement? = null,
    @SerializedName("defence")
    val defence: JsonElement? = null,
    @SerializedName("defencePierce")
    val defencePierce: JsonElement? = null,
    @SerializedName("specialdefence")
    val specialdefence: JsonElement? = null,
    @SerializedName("damage")
    val damage: JsonElement? = null,
    @SerializedName("damageIndividuality")
    val damageIndividuality: JsonElement? = null,
    @SerializedName("damageIndividualityActiveonly")
    val damageIndividualityActiveonly: JsonElement? = null,
    @SerializedName("selfdamage")
    val selfdamage: JsonElement? = null,
    @SerializedName("criticalDamage")
    val criticalDamage: JsonElement? = null,
    @SerializedName("npdamage")
    val npdamage: JsonElement? = null,
    @SerializedName("givenDamage")
    val givenDamage: JsonElement? = null,
    @SerializedName("receiveDamage")
    val receiveDamage: JsonElement? = null,
    @SerializedName("pierceInvincible")
    val pierceInvincible: JsonElement? = null,
    @SerializedName("invincible")
    val invincible: JsonElement? = null,
    @SerializedName("breakAvoidance")
    val breakAvoidance: JsonElement? = null,
    @SerializedName("avoidance")
    val avoidance: JsonElement? = null,
    @SerializedName("overwriteBattleclass")
    val overwriteBattleclass: JsonElement? = null,
    @SerializedName("overwriteClassrelatioAtk")
    val overwriteClassrelatioAtk: JsonElement? = null,
    @SerializedName("overwriteClassrelatioDef")
    val overwriteClassrelatioDef: JsonElement? = null,
    @SerializedName("commandNpAtk")
    val commandNpAtk: JsonElement? = null,
    @SerializedName("commandNpDef")
    val commandNpDef: JsonElement? = null,
    @SerializedName("dropNp")
    val dropNp: JsonElement? = null,
    @SerializedName("dropNpDamage")
    val dropNpDamage: JsonElement? = null,
    @SerializedName("commandStarAtk")
    val commandStarAtk: JsonElement? = null,
    @SerializedName("commandStarDef")
    val commandStarDef: JsonElement? = null,
    @SerializedName("criticalPoint")
    val criticalPoint: JsonElement? = null,
    @SerializedName("starweight")
    val starweight: JsonElement? = null,
    @SerializedName("turnendNp")
    val turnendNp: JsonElement? = null,
    @SerializedName("turnendStar")
    val turnendStar: JsonElement? = null,
    @SerializedName("turnendHpRegain")
    val turnendHpRegain: JsonElement? = null,
    @SerializedName("turnendHpReduce")
    val turnendHpReduce: JsonElement? = null,
    @SerializedName("gainHp")
    val gainHp: JsonElement? = null,
    @SerializedName("turnvalNp")
    val turnvalNp: JsonElement? = null,
    @SerializedName("grantState")
    val grantState: JsonElement? = null,
    @SerializedName("resistanceState")
    val resistanceState: JsonElement? = null,
    @SerializedName("avoidState")
    val avoidState: JsonElement? = null,
    @SerializedName("donotAct")
    val donotAct: JsonElement? = null,
    @SerializedName("donotSkill")
    val donotSkill: JsonElement? = null,
    @SerializedName("donotNoble")
    val donotNoble: JsonElement? = null,
    @SerializedName("donotRecovery")
    val donotRecovery: JsonElement? = null,
    @SerializedName("individualityAdd")
    val individualityAdd: JsonElement? = null,
    @SerializedName("individualitySub")
    val individualitySub: JsonElement? = null,
    @SerializedName("hate")
    val hate: JsonElement? = null,
    @SerializedName("criticalRate")
    val criticalRate: JsonElement? = null,
    @SerializedName("avoidInstantdeath")
    val avoidInstantdeath: JsonElement? = null,
    @SerializedName("resistInstantdeath")
    val resistInstantdeath: JsonElement? = null,
    @SerializedName("nonresistInstantdeath")
    val nonresistInstantdeath: JsonElement? = null,
    @SerializedName("regainNpUsedNoble")
    val regainNpUsedNoble: JsonElement? = null,
    @SerializedName("functionDead")
    val functionDead: JsonElement? = null,
    @SerializedName("maxhpRate")
    val maxhpRate: JsonElement? = null,
    @SerializedName("maxhpValue")
    val maxhpValue: JsonElement? = null,
    @SerializedName("functionWavestart")
    val functionWavestart: JsonElement? = null,
    @SerializedName("functionSelfturnend")
    val functionSelfturnend: JsonElement? = null,
    @SerializedName("giveGainHp")
    val giveGainHp: JsonElement? = null,
    @SerializedName("functionCommandattack")
    val functionCommandattack: JsonElement? = null,
    @SerializedName("functionDeadattack")
    val functionDeadattack: JsonElement? = null,
    @SerializedName("functionEntry")
    val functionEntry: JsonElement? = null,
    @SerializedName("chagetd")
    val chagetd: JsonElement? = null,
    @SerializedName("grantSubstate")
    val grantSubstate: JsonElement? = null,
    @SerializedName("toleranceSubstate")
    val toleranceSubstate: JsonElement? = null,
    @SerializedName("grantInstantdeath")
    val grantInstantdeath: JsonElement? = null,
    @SerializedName("functionDamage")
    val functionDamage: JsonElement? = null,
    @SerializedName("functionReflection")
    val functionReflection: JsonElement? = null,
    @SerializedName("multiattack")
    val multiattack: JsonElement? = null,
    @SerializedName("giveNp")
    val giveNp: JsonElement? = null,
    @SerializedName("resistanceDelayNpturn")
    val resistanceDelayNpturn: JsonElement? = null,
    @SerializedName("pierceDefence")
    val pierceDefence: JsonElement? = null,
    @SerializedName("gutsHp")
    val gutsHp: JsonElement? = null,
    @SerializedName("funcgainNp")
    val funcgainNp: JsonElement? = null,
    @SerializedName("funcHpReduce")
    val funcHpReduce: JsonElement? = null,
    @SerializedName("functionNpattack")
    val functionNpattack: JsonElement? = null,
    @SerializedName("fixCommandcard")
    val fixCommandcard: JsonElement? = null,
    @SerializedName("donotGainnp")
    val donotGainnp: JsonElement? = null,
    @SerializedName("fieldIndividuality")
    val fieldIndividuality: JsonElement? = null,
    @SerializedName("donotActCommandtype")
    val donotActCommandtype: JsonElement? = null,
    @SerializedName("damageEventPoint")
    val damageEventPoint: JsonElement? = null
)