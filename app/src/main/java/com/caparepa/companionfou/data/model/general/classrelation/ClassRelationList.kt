package com.caparepa.companionfou.data.model.general.classrelation

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class ClassRelationList(
    /** ClassRelationDetail? **/
    @SerializedName("saber")
    val saber: JsonElement? = null,
    @SerializedName("archer")
    val archer: JsonElement? = null,
    @SerializedName("lancer")
    val lancer: JsonElement? = null,
    @SerializedName("rider")
    val rider: JsonElement? = null,
    @SerializedName("caster")
    val caster: JsonElement? = null,
    @SerializedName("assassin")
    val assassin: JsonElement? = null,
    @SerializedName("berserker")
    val berserker: JsonElement? = null,
    @SerializedName("shielder")
    val shielder: JsonElement? = null,
    @SerializedName("ruler")
    val ruler: JsonElement? = null,
    @SerializedName("alterEgo")
    val alterEgo: JsonElement? = null,
    @SerializedName("avenger")
    val avenger: JsonElement? = null,
    @SerializedName("demonGodPillar")
    val demonGodPillar: JsonElement? = null,
    @SerializedName("beastII")
    val beastII: JsonElement? = null,
    @SerializedName("beastI")
    val beastI: JsonElement? = null,
    @SerializedName("moonCancer")
    val moonCancer: JsonElement? = null,
    @SerializedName("beastIIIR")
    val beastIIIR: JsonElement? = null,
    @SerializedName("foreigner")
    val foreigner: JsonElement? = null,
    @SerializedName("beastIIIL")
    val beastIIIL: JsonElement? = null,
    @SerializedName("beastUnknown")
    val beastUnknown: JsonElement? = null
)