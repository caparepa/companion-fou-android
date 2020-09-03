package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_mystic_code_item")
data class BasicMysticCodeItem(
    val male: String? = null,
    val female: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    val _id: Int? = null
}