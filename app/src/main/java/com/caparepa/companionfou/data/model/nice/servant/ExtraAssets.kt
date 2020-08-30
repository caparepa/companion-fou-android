package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class ExtraAssets(
    @Id var _id: Long = 0,
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
    val equipFace: ServantAssetItem? = null,
    @SerializedName("item")
    val masterItem: ServantAssetItem? = null,
    @SerializedName("masterFace")
    val masterFace: ServantAssetItem? = null,
    @SerializedName("masterFigure")
    val masterFigure: ServantAssetItem? = null
)