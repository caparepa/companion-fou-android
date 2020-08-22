package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName

data class CommandCodeItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("face")
    val face: String? = null
)