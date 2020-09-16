package com.caparepa.companionfou.data.model.nice.servant

import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.google.gson.annotations.SerializedName

data class ServantMaterial(
    @SerializedName("item")
    val item: MaterialItem? = null,
    @SerializedName("amount")
    val amount: Int? = null
)