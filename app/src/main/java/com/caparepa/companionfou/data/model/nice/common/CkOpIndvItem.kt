package com.caparepa.companionfou.data.model.nice.common

import com.google.gson.annotations.SerializedName

data class CkOpIndvItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
)