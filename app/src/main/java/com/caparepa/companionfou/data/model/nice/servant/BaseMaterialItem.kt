package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class BaseMaterialItem(
    @SerializedName("item")
    val item: BaseMaterialDetail? = null,
    @SerializedName("amount")
    val amount: Int? = null
)