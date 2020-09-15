package com.caparepa.companionfou.data.db.entity.general

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "all_traits"
)
class AllTraitsEntity(
    @PrimaryKey
    val id: Long? = null,
    val traitValue: String? = null
) {
    /**
     * TODO: map the response to this entity via a forEach
     */

}