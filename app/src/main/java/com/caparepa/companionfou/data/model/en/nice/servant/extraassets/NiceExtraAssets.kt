package com.caparepa.companionfou.data.model.en.nice.servant.extraassets


import com.google.gson.annotations.SerializedName

data class NiceExtraAssets(
    @SerializedName("charaGraph")
    val charaGraph: CharaGraph? = null,
    @SerializedName("faces")
    val faces: Faces? = null,
    @SerializedName("narrowFigure")
    val narrowFigure: NarrowFigure? = null,
    @SerializedName("charaFigure")
    val charaFigure: CharaFigure? = null,
    @SerializedName("commands")
    val commands: Commands? = null,
    @SerializedName("status")
    val status: Status? = null,
    @SerializedName("equipFace")
    val equipFace: EquipFace? = null
)