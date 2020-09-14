package com.caparepa.companionfou.data.model.general.classrelation



import com.google.gson.annotations.SerializedName

data class ClassRelationList(
    /** ClassRelationDetail? **/
    @SerializedName("saber")
    val saber: String? = null,
    @SerializedName("archer")
    val archer: String? = null,
    @SerializedName("lancer")
    val lancer: String? = null,
    @SerializedName("rider")
    val rider: String? = null,
    @SerializedName("caster")
    val caster: String? = null,
    @SerializedName("assassin")
    val assassin: String? = null,
    @SerializedName("berserker")
    val berserker: String? = null,
    @SerializedName("shielder")
    val shielder: String? = null,
    @SerializedName("ruler")
    val ruler: String? = null,
    @SerializedName("alterEgo")
    val alterEgo: String? = null,
    @SerializedName("avenger")
    val avenger: String? = null,
    @SerializedName("demonGodPillar")
    val demonGodPillar: String? = null,
    @SerializedName("beastII")
    val beastII: String? = null,
    @SerializedName("beastI")
    val beastI: String? = null,
    @SerializedName("moonCancer")
    val moonCancer: String? = null,
    @SerializedName("beastIIIR")
    val beastIIIR: String? = null,
    @SerializedName("foreigner")
    val foreigner: String? = null,
    @SerializedName("beastIIIL")
    val beastIIIL: String? = null,
    @SerializedName("beastUnknown")
    val beastUnknown: String? = null
)