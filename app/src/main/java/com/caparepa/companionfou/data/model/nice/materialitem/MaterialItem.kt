package com.caparepa.companionfou.data.model.nice.materialitem


import com.google.gson.annotations.SerializedName

data class MaterialItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("background")
    val background: String? = null
)
