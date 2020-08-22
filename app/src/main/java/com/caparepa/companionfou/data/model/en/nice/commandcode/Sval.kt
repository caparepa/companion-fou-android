package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName

data class Sval(
    @SerializedName("Rate")
    val rate: Int? = null,
    @SerializedName("Turn")
    val turn: Int? = null,
    @SerializedName("Count")
    val count: Int? = null,
    @SerializedName("Value")
    val value: Int? = null
)