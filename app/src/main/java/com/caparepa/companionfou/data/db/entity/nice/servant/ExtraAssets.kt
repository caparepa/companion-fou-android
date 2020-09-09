package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "extra_assets"
)
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
    val equipFace: ServantAssetItem? = null,
    @SerializedName("item")
    val masterItem: ServantAssetItem? = null,
    @SerializedName("masterFace")
    val masterFace: ServantAssetItem? = null,
    @SerializedName("masterFigure")
    val masterFigure: ServantAssetItem? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}