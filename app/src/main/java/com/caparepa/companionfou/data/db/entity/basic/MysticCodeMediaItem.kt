package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_mystic_code_media")
data class MysticCodeMediaItem(
    @SerializedName("male")
    val male: String?,
    @SerializedName("female")
    val female: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mCodeMediaId: Long = 0
}