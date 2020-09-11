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
    val charaGraph: ServantAssetItem? = null,
    @Embedded(prefix = "asset_faces_")
    @SerializedName("faces")
    val faces: ServantAssetItem? = null,
    @Embedded(prefix = "asset_narrow_fig_")
    @SerializedName("narrowFigure")
    val narrowFigure: ServantAssetItem? = null,
    @Embedded(prefix = "asset_chara_fig_")
    @SerializedName("charaFigure")
    val charaFigure: ServantAssetItem? = null,
    @Embedded(prefix = "asset_command_")
    @SerializedName("commands")
    val commands: ServantAssetItem? = null,
    @Embedded(prefix = "asset_status_")
    @SerializedName("status")
    val status: ServantAssetItem? = null,
    @Embedded(prefix = "asset_eq_face")
    @SerializedName("equipFace")
    val equipFace: ServantAssetItem? = null,
    @Embedded(prefix = "asset_item_")
    @SerializedName("item")
    val masterItem: ServantAssetItem? = null,
    @Embedded(prefix = "asset_master_face_")
    @SerializedName("masterFace")
    val masterFace: ServantAssetItem? = null,
    @Embedded(prefix = "asset_master_fig_")
    @SerializedName("masterFigure")
    val masterFigure: ServantAssetItem? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}