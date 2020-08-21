package com.caparepa.companionfou.data.model.en.nice.servant.ascensionskillmaterials


import com.google.gson.annotations.SerializedName

data class NiceItem(
    @SerializedName("item")
    val item: NiceItemDetail? = null,
    @SerializedName("amount")
    val amount: Int? = null
)