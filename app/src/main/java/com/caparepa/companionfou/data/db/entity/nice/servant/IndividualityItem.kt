package com.caparepa.companionfou.data.db.entity.nice.servant

import com.google.gson.annotations.SerializedName

data class IndividualityItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
)