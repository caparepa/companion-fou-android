package com.caparepa.companionfou.data.model.common

import com.google.gson.annotations.SerializedName

data class ExtraAssets(
    /*Command Code*/
    @SerializedName("charaGraph")
    val charaGraph: AssetItem? = null,
    @SerializedName("faces")
    val faces: AssetItem? = null,
    /*Servant*/
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
    /*Mystic Code*/
    @SerializedName("item")
    val masterItem: Map<String, String>? = null,
    @SerializedName("masterFace")
    val masterFace: Map<String, String>? = null,
    @SerializedName("masterFigure")
    val masterFigure: Map<String, String>? = null
)