package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_mystic_code")
data class MysticCodeItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("item")
    @Embedded(prefix = "media_")
    val item: MysticCodeMediaItem?
) {
    @PrimaryKey(autoGenerate = false)
    var mCodeId: Long = id!!
}