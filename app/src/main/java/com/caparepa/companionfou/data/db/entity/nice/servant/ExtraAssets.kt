package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "extra_assets"
)
data class ExtraAssets(
    @Embedded(prefix = "asset_char_graph_")
    @SerializedName("charaGraph")
    val charaGraph: ServantAssetItem?,
    @Embedded(prefix = "asset_faces_")
    @SerializedName("faces")
    val faces: ServantAssetItem?,
    @Embedded(prefix = "asset_narrow_fig_")
    @SerializedName("narrowFigure")
    val narrowFigure: ServantAssetItem?,
    @Embedded(prefix = "asset_chara_fig_")
    @SerializedName("charaFigure")
    val charaFigure: ServantAssetItem?,
    @Embedded(prefix = "asset_command_")
    @SerializedName("commands")
    val commands: ServantAssetItem?,
    @Embedded(prefix = "asset_status_")
    @SerializedName("status")
    val status: ServantAssetItem?,
    @Embedded(prefix = "asset_eq_face")
    @SerializedName("equipFace")
    val equipFace: ServantAssetItem?,
    @Embedded(prefix = "asset_item_")
    @SerializedName("item")
    val masterItem: ServantAssetItem?,
    @Embedded(prefix = "asset_master_face_")
    @SerializedName("masterFace")
    val masterFace: ServantAssetItem?,
    @Embedded(prefix = "asset_master_fig_")
    @SerializedName("masterFigure")
    val masterFigure: ServantAssetItem?
) {
    @PrimaryKey(autoGenerate = true)
    var nAssetId: Long = 0
}