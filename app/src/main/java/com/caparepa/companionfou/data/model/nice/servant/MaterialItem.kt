package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class MaterialItem(
    @SerializedName("item")
    val item: MaterialDetail? = null,
    @SerializedName("amount")
    val amount: Int? = null
)