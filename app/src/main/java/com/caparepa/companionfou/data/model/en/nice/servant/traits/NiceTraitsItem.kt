package com.caparepa.companionfou.data.model.en.nice.servant.traits


import com.google.gson.annotations.SerializedName

data class NiceTraitsItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null
)