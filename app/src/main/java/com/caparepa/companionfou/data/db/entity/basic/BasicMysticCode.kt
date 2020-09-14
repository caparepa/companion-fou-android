package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(tableName = "basic_mystic_code")
data class BasicMysticCode(
    @PrimaryKey
    val id: Long? = null,
    val name: String? = null,
    val item: String? = null
) {
    fun getBasicMysticCodeMedia(): BasicMysticCodeMedia? {
        return this.item?.toKotlinObject()
    }
}