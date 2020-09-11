package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "skill_script")
class Script(
    val id: Long?
) {
    @PrimaryKey(autoGenerate = true)
    var nScriptId: Long = 0
}