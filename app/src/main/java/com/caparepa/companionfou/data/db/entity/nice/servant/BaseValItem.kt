package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "base_val",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class BaseValItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}