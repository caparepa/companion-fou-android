package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName

data class MysticCodeInnerItem(
    @SerializedName("male")
    val male: String? = null,
    @SerializedName("female")
    val female: String? = null
)