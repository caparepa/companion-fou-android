package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class ExtraAssets(
    @SerializedName("charaGraph")
    val charaGraph: ServantAssetItem? = null,
    @SerializedName("faces")
    val faces: ServantAssetItem? = null,
    @SerializedName("narrowFigure")
    val narrowFigure: ServantAssetItem? = null,
    @SerializedName("charaFigure")
    val charaFigure: ServantAssetItem? = null,
    @SerializedName("commands")
    val commands: ServantAssetItem? = null,
    @SerializedName("status")
    val status: ServantAssetItem? = null,
    @SerializedName("equipFace")
    val equipFace: ServantAssetItem? = null
)