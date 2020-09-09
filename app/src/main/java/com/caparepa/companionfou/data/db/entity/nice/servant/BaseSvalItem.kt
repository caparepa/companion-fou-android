package com.caparepa.companionfou.data.db.entity.nice.servant

import com.google.gson.annotations.SerializedName

data class BaseSvalItem(
    @SerializedName("Rate")
    val rate: Int? = null,
    @SerializedName("Turn")
    val turn: Int? = null,
    @SerializedName("Count")
    val count: Int? = null,
    @SerializedName("Value")
    val value: Int? = null,
    @SerializedName("Value2")
    val value2: Int? = null,
    @SerializedName("ShowState")
    val showState: Int? = null,
    @SerializedName("OnField")
    val onField: Int? = null,
    @SerializedName("UseRate")
    val useRate: Int? = null
)