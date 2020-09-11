package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "individuality_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class IndividualityItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?
) {
    @PrimaryKey(autoGenerate = true)
    var nIndId: Long = 0
}