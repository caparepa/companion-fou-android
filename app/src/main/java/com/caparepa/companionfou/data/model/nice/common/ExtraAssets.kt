package com.caparepa.companionfou.data.model.nice.common

import com.google.gson.annotations.SerializedName

data class ExtraAssets(
    @SerializedName("charaGraph")
    val charaGraph: AssetItem,
    @SerializedName("faces")
    val faces: AssetItem,
    @SerializedName("narrowFigure")
    val narrowFigure: AssetItem,
    @SerializedName("charaFigure")
    val charaFigure: AssetItem,
    @SerializedName("commands")
    val commands: AssetItem,
    @SerializedName("status")
    val status: AssetItem,
    @SerializedName("equipFace")
    val equipFace: AssetItem,
    @SerializedName("item")
    val masterItem: AssetItem,
    @SerializedName("masterFace")
    val masterFace: AssetItem,
    @SerializedName("masterFigure")
    val masterFigure: AssetItem
)