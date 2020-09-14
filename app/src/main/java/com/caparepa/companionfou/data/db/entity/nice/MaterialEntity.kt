package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "material"
)
data class MaterialEntity(
    @PrimaryKey
    val id: Long? = null,
    val name: String? = null,
    val type: String? = null,
    val icon: String? = null,
    val background: String? = null
)