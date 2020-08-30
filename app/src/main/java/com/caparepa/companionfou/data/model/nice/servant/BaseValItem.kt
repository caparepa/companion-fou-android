package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class BaseValItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
)