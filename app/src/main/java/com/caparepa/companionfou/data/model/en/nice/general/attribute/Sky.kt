package com.caparepa.companionfou.data.model.en.nice.general.attribute


import com.google.gson.annotations.SerializedName

data class Sky(
    @SerializedName("human")
    val human: Int? = null,
    @SerializedName("sky")
    val sky: Int? = null,
    @SerializedName("earth")
    val earth: Int? = null,
    @SerializedName("star")
    val star: Int? = null,
    @SerializedName("beast")
    val beast: Int? = null
)