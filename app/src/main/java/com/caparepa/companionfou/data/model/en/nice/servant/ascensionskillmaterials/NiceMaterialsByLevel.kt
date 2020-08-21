package com.caparepa.companionfou.data.model.en.nice.servant.ascensionskillmaterials


import com.google.gson.annotations.SerializedName

data class NiceMaterialsByLevel(
    @SerializedName("items")
    val items: List<NiceItem>? = null,
    @SerializedName("qp")
    val qp: Int? = null
)