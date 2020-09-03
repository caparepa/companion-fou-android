package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_embedded_mc_item")
data class EmbeddedMysticCodeEntity(
    val male: String? = null,
    val female: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    val _id: Int? = null
}