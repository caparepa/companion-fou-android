package com.caparepa.companionfou.data.model.common.nice.general.classrelation


import com.google.gson.annotations.SerializedName

data class ClassRelationList(
    @SerializedName("saber")
    val saber: ClassRelationDetail? = null,
    @SerializedName("archer")
    val archer: ClassRelationDetail? = null,
    @SerializedName("lancer")
    val lancer: ClassRelationDetail? = null,
    @SerializedName("rider")
    val rider: ClassRelationDetail? = null,
    @SerializedName("caster")
    val caster: ClassRelationDetail? = null,
    @SerializedName("assassin")
    val assassin: ClassRelationDetail? = null,
    @SerializedName("berserker")
    val berserker: ClassRelationDetail? = null,
    @SerializedName("shielder")
    val shielder: ClassRelationDetail? = null,
    @SerializedName("ruler")
    val ruler: ClassRelationDetail? = null,
    @SerializedName("alterEgo")
    val alterEgo: ClassRelationDetail? = null,
    @SerializedName("avenger")
    val avenger: ClassRelationDetail? = null,
    @SerializedName("demonGodPillar")
    val demonGodPillar: ClassRelationDetail? = null,
    @SerializedName("beastII")
    val beastII: ClassRelationDetail? = null,
    @SerializedName("beastI")
    val beastI: ClassRelationDetail? = null,
    @SerializedName("moonCancer")
    val moonCancer: ClassRelationDetail? = null,
    @SerializedName("beastIIIR")
    val beastIIIR: ClassRelationDetail? = null,
    @SerializedName("foreigner")
    val foreigner: ClassRelationDetail? = null,
    @SerializedName("beastIIIL")
    val beastIIIL: ClassRelationDetail? = null,
    @SerializedName("beastUnknown")
    val beastUnknown: ClassRelationDetail? = null
)