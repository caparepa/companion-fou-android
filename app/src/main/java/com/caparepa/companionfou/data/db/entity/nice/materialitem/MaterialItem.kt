package com.caparepa.companionfou.data.db.entity.nice.materialitem

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "nice_material_item",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
data class MaterialItem(
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
    var mItemId: Long = 0
}
