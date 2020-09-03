package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_embedded_mc_item")
data class EmbeddedMysticCodeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val male: String? = null,
    val female: String? = null
)