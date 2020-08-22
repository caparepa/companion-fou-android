package com.caparepa.companionfou.data.model.en.nice.general.classrelation


import com.google.gson.annotations.SerializedName

data class ClassRelationParams(
    @SerializedName("saber")
    val saber: Int? = null,
    @SerializedName("archer")
    val archer: Int? = null,
    @SerializedName("lancer")
    val lancer: Int? = null,
    @SerializedName("rider")
    val rider: Int? = null,
    @SerializedName("caster")
    val caster: Int? = null,
    @SerializedName("assassin")
    val assassin: Int? = null,
    @SerializedName("berserker")
    val berserker: Int? = null,
    @SerializedName("shielder")
    val shielder: Int? = null,
    @SerializedName("ruler")
    val ruler: Int? = null,
    @SerializedName("alterEgo")
    val alterEgo: Int? = null,
    @SerializedName("avenger")
    val avenger: Int? = null,
    @SerializedName("demonGodPillar")
    val demonGodPillar: Int? = null,
    @SerializedName("beastII")
    val beastII: Int? = null,
    @SerializedName("beastI")
    val beastI: Int? = null,
    @SerializedName("moonCancer")
    val moonCancer: Int? = null,
    @SerializedName("beastIIIR")
    val beastIIIR: Int? = null,
    @SerializedName("foreigner")
    val foreigner: Int? = null,
    @SerializedName("beastIIIL")
    val beastIIIL: Int? = null,
    @SerializedName("beastUnknown")
    val beastUnknown: Int? = null
)