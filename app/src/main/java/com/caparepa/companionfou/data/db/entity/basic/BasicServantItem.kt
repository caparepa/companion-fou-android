package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "basic_servant")
data class BasicServantItem(
    @PrimaryKey
    val id: Long? = null,
    val collectionNo: Long? = null,
    val type: String? = null,
    val name: String? = null,
    val className: String? = null,
    val rarity: Int? = null,
    val face: String? = null
)