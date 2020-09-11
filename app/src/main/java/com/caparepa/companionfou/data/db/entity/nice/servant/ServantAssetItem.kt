package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "asset_item"
)
data class ServantAssetItem(
    @Embedded(prefix = "asset_ascension_")
    @SerializedName("ascension")
    val ascension: Map<Int, String?>? = null,
    @Embedded(prefix = "asset_costume_")
    @SerializedName("costume")
    val costume: Map<Int, String?>? = null,
    @Embedded(prefix = "asset_equip_")
    @SerializedName("equip")
    val equip: Map<Int, String?>? = null,
    @Embedded(prefix = "asset_cc_")
    @SerializedName("cc")
    val cc: Map<Int, String?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}
