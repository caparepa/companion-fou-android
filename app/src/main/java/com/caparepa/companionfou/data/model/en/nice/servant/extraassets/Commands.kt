package com.caparepa.companionfou.data.model.en.nice.servant.extraassets


import com.google.gson.annotations.SerializedName

data class Commands(
    @SerializedName("ascension")
    val ascension: NiceAscensionObj? = null
)