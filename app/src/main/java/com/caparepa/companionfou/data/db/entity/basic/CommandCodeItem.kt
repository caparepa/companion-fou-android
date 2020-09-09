package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "basic_command_code",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
data class CommandCodeItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("collectionNo")
    val collectionNo: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("rarity")
    val rarity: Int?,
    @SerializedName("face")
    val face: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mCommandId: Long = 0
}