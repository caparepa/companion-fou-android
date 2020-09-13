package com.caparepa.companionfou.data.model.nice.common

import com.google.gson.annotations.SerializedName

data class AssetItem(
    @SerializedName("ascension")
    val ascension: Map<Int, String?>?,
    @SerializedName("costume")
    val costume: Map<Int, String?>?,
    @SerializedName("equip")
    val equip: Map<Int, String?>?,
    @SerializedName("cc")
    val cc: Map<Int, String?>?
)
