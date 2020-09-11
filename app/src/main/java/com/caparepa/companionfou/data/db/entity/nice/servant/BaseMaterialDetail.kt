package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "material_detail",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class BaseMaterialDetail(
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
    @ColumnInfo(name = "matDetId")
    var mId: Long = 0
}