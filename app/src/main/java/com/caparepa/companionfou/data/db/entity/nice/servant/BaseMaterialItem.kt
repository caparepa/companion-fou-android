package com.caparepa.companionfou.data.db.entity.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.BaseMaterialDetail
import com.google.gson.annotations.SerializedName

data class BaseMaterialItem(
    @SerializedName("item")
    val item: BaseMaterialDetail? = null,
    @SerializedName("amount")
    val amount: Int? = null
)