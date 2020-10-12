package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "servant_traits"
)
class ServantTraitEntity(
    @ColumnInfo(name = "server")
    val server: String? = null,
    @ColumnInfo(name = "trait_map_value")
    val traitMapValue: String? = null
) {
    @ColumnInfo(name = "table_id")
    @PrimaryKey(autoGenerate = true)
    var tableId: Long = 0

    fun getTraitMapValue(): Map<Int, String>? {
        return this.traitMapValue?.toKotlinObject()
    }
}