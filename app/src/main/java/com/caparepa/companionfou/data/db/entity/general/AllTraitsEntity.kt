package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "all_traits"
)
class AllTraitsEntity(
    /** Map<Int, String>**/
    @ColumnInfo(name = "trait_map")
    val traitMapValue: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Long? = 0

    fun getAllTraits(): HashMap<Int, String>? {
        return this.traitMapValue?.toKotlinObject()
    }
}