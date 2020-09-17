package com.caparepa.companionfou.data.model.general.other


import com.google.gson.annotations.SerializedName

data class ApiInfo(
    @SerializedName("NA")
    val na: ApiInfoData? = null,
    @SerializedName("JP")
    val jp: ApiInfoData? = null
)