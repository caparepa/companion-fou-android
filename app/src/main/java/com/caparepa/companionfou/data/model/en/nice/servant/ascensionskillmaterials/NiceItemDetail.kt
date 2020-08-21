package com.caparepa.companionfou.data.model.en.nice.servant.ascensionskillmaterials


import com.google.gson.annotations.SerializedName

data class NiceItemDetail(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("background")
    val background: String? = null
)