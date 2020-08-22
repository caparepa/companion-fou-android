package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName

data class CraftEssenceItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("className")
    val className: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("face")
    val face: String? = null
)