package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(tableName = "basic_mystic_code")
data class BasicMysticCode(
    val id: Long? = null,
    val name: String? = null,
    @Embedded(prefix = "media_")
    val item: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mCodeId: Long = 0

    fun getBasicMysticCodeMedia(): BasicMysticCodeMedia? {
        return this.item?.toKotlinObject()
    }
}