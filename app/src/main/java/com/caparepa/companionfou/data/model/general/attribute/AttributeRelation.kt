package com.caparepa.companionfou.data.model.general.attribute

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class AttributeRelation(
    /** RelationDetail **/
    @SerializedName("human")
    val human: JsonElement? = null,
    @SerializedName("sky")
    val sky: JsonElement? = null,
    @SerializedName("earth")
    val earth: JsonElement? = null,
    @SerializedName("star")
    val star: JsonElement? = null,
    @SerializedName("beast")
    val beast: JsonElement? = null
)