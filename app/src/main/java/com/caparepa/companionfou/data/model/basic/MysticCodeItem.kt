package com.caparepa.companionfou.data.model.basic


import com.google.gson.annotations.SerializedName

data class MysticCodeItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("item")
    val item: MysticCodeInnerItem? = null
)
