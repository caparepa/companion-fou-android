package com.caparepa.companionfou.data.db.entity.nice.materialitem

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "nice_material_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class MaterialItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("icon")
    val icon: String?,
    @SerializedName("background")
    val background: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mItemId: Long = 0
}
