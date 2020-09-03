package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "basic_mystic_code")
data class BasicMysticCode(
    val id: Long? = null,
    val name: String? = null,
    @Embedded
    val item: BasicMysticCodeItem? = null
) {
    @PrimaryKey(autoGenerate = false)
    var _id: Long = id!!
}