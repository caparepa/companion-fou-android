package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "skill_script")
class Script() {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}