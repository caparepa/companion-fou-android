package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class SkillMaterials(
    @SerializedName("items")
    val items: List<BaseMaterialItem?>? = null,
    @SerializedName("qp")
    val qp: Int? = null
)