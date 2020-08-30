package com.caparepa.companionfou.data.model.general.attribute


import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class AttributeRelation(
    @Id var _id: Long = 0,
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