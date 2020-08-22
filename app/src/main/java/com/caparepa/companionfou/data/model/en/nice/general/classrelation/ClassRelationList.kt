package com.caparepa.companionfou.data.model.en.nice.general.classrelation


import com.google.gson.annotations.SerializedName

data class ClassRelationList(
    @SerializedName("saber")
    val saber: ClassRelationParams? = null,
    @SerializedName("archer")
    val archer: ClassRelationParams? = null,
    @SerializedName("lancer")
    val lancer: ClassRelationParams? = null,
    @SerializedName("rider")
    val rider: ClassRelationParams? = null,
    @SerializedName("caster")
    val caster: ClassRelationParams? = null,
    @SerializedName("assassin")
    val assassin: ClassRelationParams? = null,
    @SerializedName("berserker")
    val berserker: ClassRelationParams? = null,
    @SerializedName("shielder")
    val shielder: ClassRelationParams? = null,
    @SerializedName("ruler")
    val ruler: ClassRelationParams? = null,
    @SerializedName("alterEgo")
    val alterEgo: ClassRelationParams? = null,
    @SerializedName("avenger")
    val avenger: ClassRelationParams? = null,
    @SerializedName("demonGodPillar")
    val demonGodPillar: ClassRelationParams? = null,
    @SerializedName("beastII")
    val beastII: ClassRelationParams? = null,
    @SerializedName("beastI")
    val beastI: ClassRelationParams? = null,
    @SerializedName("moonCancer")
    val moonCancer: ClassRelationParams? = null,
    @SerializedName("beastIIIR")
    val beastIIIR: ClassRelationParams? = null,
    @SerializedName("foreigner")
    val foreigner: ClassRelationParams? = null,
    @SerializedName("beastIIIL")
    val beastIIIL: ClassRelationParams? = null,
    @SerializedName("beastUnknown")
    val beastUnknown: ClassRelationParams? = null
)