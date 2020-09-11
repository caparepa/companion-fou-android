package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "skill_script")
class Script(
    val id: Long? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}