package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.general.other.ApiInfoData
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "api_info"
)
data class ApiInfoEntity(
    @ColumnInfo(name = "na")
    val na: String? = null,
    @ColumnInfo(name = "na")
    val jp: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

    fun String.getApiInfoData(): ApiInfoData? {
        return this.toKotlinObject()
    }
}