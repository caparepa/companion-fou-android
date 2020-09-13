package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName

data class BasicMysticCodeMediaItem(
    @SerializedName("male")
    val male: String? = null,
    @SerializedName("female")
    val female: String? = null
)