package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName

data class BasicMysticCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("item")
    val item: BasicMysticCodeMediaItem? = null
)
