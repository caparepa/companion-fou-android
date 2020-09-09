package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "trait_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class TraitItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}