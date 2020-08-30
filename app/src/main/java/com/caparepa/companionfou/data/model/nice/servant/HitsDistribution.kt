package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class HitsDistribution(
    @SerializedName("arts")
    val arts: List<Int?>? = null,
    @SerializedName("buster")
    val buster: List<Int?>? = null,
    @SerializedName("quick")
    val quick: List<Int?>? = null,
    @SerializedName("extra")
    val extra: List<Int?>? = null
)