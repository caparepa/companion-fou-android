package com.caparepa.companionfou.data.model.general.attribute


import com.google.gson.annotations.SerializedName

data class AttributeRelation(
    @SerializedName("human")
    val human: RelationDetail? = null,
    @SerializedName("sky")
    val sky: RelationDetail? = null,
    @SerializedName("earth")
    val earth: RelationDetail? = null,
    @SerializedName("star")
    val star: RelationDetail? = null,
    @SerializedName("beast")
    val beast: RelationDetail? = null
)