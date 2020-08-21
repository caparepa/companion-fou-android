package com.caparepa.companionfou.data.model.en.nice.servant.hitdistribution


import com.google.gson.annotations.SerializedName

data class NiceHitDistribution(
    @SerializedName("arts")
    val arts: List<Int>? = null,
    @SerializedName("buster")
    val buster: List<Int>? = null,
    @SerializedName("quick")
    val quick: List<Int>? = null,
    @SerializedName("extra")
    val extra: List<Int>? = null
)