package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class BaseMaterialItem(
    @Id var _id: Long = 0,
    @SerializedName("item")
    val item: BaseMaterialDetail? = null,
    @SerializedName("amount")
    val amount: Int? = null
)