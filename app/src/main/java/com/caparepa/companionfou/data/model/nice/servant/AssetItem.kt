package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class AssetItem(
    @SerializedName("ascension")
    val ascension: Map<Int, String?>? = null,
    @SerializedName("costume")
    val costume: Map<Int, String?>? = null,
    @SerializedName("equip")
    val equip: Map<Int, String?>? = null,
    @SerializedName("cc")
    val cc: Map<Int, String?>? = null
)
