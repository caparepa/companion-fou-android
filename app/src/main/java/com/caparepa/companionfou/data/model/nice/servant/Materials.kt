package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class Materials(
    @SerializedName("items")
    val items: List<ServantMaterial?>? = null,
    @SerializedName("qp")
    val qp: Int? = null
)