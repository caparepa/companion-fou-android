package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "servant_traits"
)
class TraitEntity(
    @ColumnInfo(name = "trait_map_value")
    val trait_map_value: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long? = 0

    fun getTraitMapValue(): Map<Int, String>? {
        return this.trait_map_value?.toKotlinObject()
    }
}