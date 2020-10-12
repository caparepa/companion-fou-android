package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelDetail
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "user_level"
)
data class UserLevelEntity(
    @ColumnInfo(name = "server")
    val server: String? = null,
    @ColumnInfo(name = "user_level_map")
    val userLevelMap: String? = null

)  {
    @ColumnInfo(name = "table_id")
    @PrimaryKey(autoGenerate = true)
    var tableId: Long = 0

    fun getUserLevelDetail(): Map<Int, UserLevelDetail>? {
        return this.userLevelMap?.toKotlinObject()
    }

}