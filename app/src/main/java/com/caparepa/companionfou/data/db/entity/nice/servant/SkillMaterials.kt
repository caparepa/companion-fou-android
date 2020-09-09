package com.caparepa.companionfou.data.db.entity.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.BaseMaterialItem
import com.google.gson.annotations.SerializedName

data class SkillMaterials(
    @SerializedName("items")
    val items: List<BaseMaterialItem?>? = null,
    @SerializedName("qp")
    val qp: Int? = null
)