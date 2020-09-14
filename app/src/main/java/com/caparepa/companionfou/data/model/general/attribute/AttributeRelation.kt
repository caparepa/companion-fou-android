package com.caparepa.companionfou.data.model.general.attribute

import com.google.gson.String
import com.google.gson.annotations.SerializedName

data class AttributeRelation(
    /** RelationDetail **/
    @SerializedName("human")
    val human: String? = null,
    @SerializedName("sky")
    val sky: String? = null,
    @SerializedName("earth")
    val earth: String? = null,
    @SerializedName("star")
    val star: String? = null,
    @SerializedName("beast")
    val beast: String? = null
)