package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class ExtraAssets(
    @SerializedName("charaGraph")
    val charaGraph: AssetItem? = null,
    @SerializedName("faces")
    val faces: AssetItem? = null,
    @SerializedName("narrowFigure")
    val narrowFigure: AssetItem? = null,
    @SerializedName("charaFigure")
    val charaFigure: AssetItem? = null,
    @SerializedName("commands")
    val commands: AssetItem? = null,
    @SerializedName("status")
    val status: AssetItem? = null,
    @SerializedName("equipFace")
    val equipFace: AssetItem? = null,
    @SerializedName("item")
    val masterItem: AssetItem? = null,
    @SerializedName("masterFace")
    val masterFace: AssetItem? = null,
    @SerializedName("masterFigure")
    val masterFigure: AssetItem? = null
)