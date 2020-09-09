package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "base_material_detail",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class BaseMaterialDetail(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("background")
    val background: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mMaterialDetailId: Long = 0
}