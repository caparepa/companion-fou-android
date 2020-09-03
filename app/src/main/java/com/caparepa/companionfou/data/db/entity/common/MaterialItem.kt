package com.caparepa.companionfou.data.db.entity.common

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "material_item")
data class MaterialItem(
    val id: Long? = null,
    val name: String? = null,
    val type: String? = null,
    val icon: String? = null,
    val background: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var _id: Long = id!!
}
