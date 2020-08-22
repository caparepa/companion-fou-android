package com.caparepa.companionfou.data.model.en.nice.general.attribute


import com.google.gson.annotations.SerializedName

data class AttributeRelation(
    @SerializedName("human")
    val human: Human? = null,
    @SerializedName("sky")
    val sky: Sky? = null,
    @SerializedName("earth")
    val earth: Earth? = null,
    @SerializedName("star")
    val star: Star? = null,
    @SerializedName("beast")
    val beast: Beast? = null
)