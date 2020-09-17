package com.caparepa.companionfou.data.model.general.other

import com.google.gson.annotations.SerializedName

data class ApiInfoData(
    @SerializedName("hash")
    val hash: String? = null,
    @SerializedName("timestamp")
    val timestamp: Int? = null
)