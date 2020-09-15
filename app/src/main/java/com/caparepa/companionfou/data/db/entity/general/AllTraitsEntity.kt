package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "all_traits",
    indices = [
        Index(value = ["trait_id"], unique = true)
    ]
)
class AllTraitsEntity(
    @ColumnInfo(name = "trait_id")
    val traitId: Long? = null,
    @ColumnInfo(name = "trait_value")
    val traitValue: String? = null
) {
    //TODO: the original response must be processed from a Map<Int, String>

    @PrimaryKey(autoGenerate = true)
    var id: Long? = 0
}