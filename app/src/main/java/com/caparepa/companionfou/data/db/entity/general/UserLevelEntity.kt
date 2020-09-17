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
    /**
     * Map<Int, UserLevelDetail>?
     */
    @ColumnInfo(name = "user_level_map")
    val user_level_map: String? = null

)  {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

    fun String.getUserLevelDetail(): Map<Int, UserLevelDetail>? {
        return this.toKotlinObject()
    }

}