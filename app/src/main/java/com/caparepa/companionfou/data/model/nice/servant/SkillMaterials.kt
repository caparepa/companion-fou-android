package com.caparepa.companionfou.data.model.nice.servant


import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class SkillMaterials(
    @Id var _id: Long = 0,
    @SerializedName("items")
    val items: List<BaseMaterialItem?>? = null,
    @SerializedName("qp")
    val qp: Int? = null
)