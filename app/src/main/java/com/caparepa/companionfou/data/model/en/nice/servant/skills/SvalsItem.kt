package com.caparepa.companionfou.data.model.en.nice.servant.skills


import com.google.gson.annotations.SerializedName

data class SvalsItem(
    @SerializedName("Rate")
    val rate: Int? = null,
    @SerializedName("Turn")
    val turn: Int? = null,
    @SerializedName("Count")
    val count: Int? = null,
    @SerializedName("Value")
    val value: Int? = null
)