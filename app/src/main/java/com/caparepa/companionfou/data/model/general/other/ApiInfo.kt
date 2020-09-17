package com.caparepa.companionfou.data.model.general.other


import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class ApiInfo(
    @SerializedName("NA")
    val na: JsonElement? = null,
    @SerializedName("JP")
    val jp: JsonElement? = null
)