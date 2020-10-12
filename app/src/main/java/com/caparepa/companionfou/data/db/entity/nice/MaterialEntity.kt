package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "material"
)
data class MaterialEntity(
    @ColumnInfo(name = "server")
    val server: String? = null,
    @ColumnInfo(name = "item_id")
    val item_id: Long? = null,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "type")
    val type: String? = null,
    @ColumnInfo(name = "icon")
    val icon: String? = null,
    @ColumnInfo(name = "background")
    val background: String? = null
) {
    @ColumnInfo(name = "table_id")
    @PrimaryKey(autoGenerate = true)
    var tableId: Long = 0
}