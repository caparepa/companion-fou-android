package com.caparepa.companionfou.data.model.common.nice.general.buffaction

import com.google.gson.annotations.SerializedName

data class BuffActionParams(
    @SerializedName("limit")
    val limit: String? = null,
    @SerializedName("plusTypes")
    val plusTypes: List<String?>? = null,
    @SerializedName("minusTypes")
    val minusTypes: List<String?>? = null,
    @SerializedName("baseParam")
    val baseParam: Int? = null,
    @SerializedName("baseValue")
    val baseValue: Int? = null,
    @SerializedName("isRec")
    val isRec: Boolean? = null,
    @SerializedName("plusAction")
    val plusAction: Int? = null,
    @SerializedName("maxRate")
    val maxRate: List<Int?>? = null
)