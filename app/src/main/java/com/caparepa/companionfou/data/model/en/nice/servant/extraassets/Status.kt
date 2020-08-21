package com.caparepa.companionfou.data.model.en.nice.servant.extraassets


import com.caparepa.companionfou.data.model.en.nice.servant.extraassets.NiceAscensionObj
import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("ascension")
    val ascension: NiceAscensionObj? = null
)