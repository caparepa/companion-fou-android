package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_mystic_code_media")
data class BasicMysticCodeMedia(
    val male: String? = null,
    val female: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    val mCodeMediaId: Int? = null
}