package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.MysticCodeMediaItem

@Dao
interface BasicMysticCodeMediaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(innerItem: MysticCodeMediaItem)

    @Query("SELECT * FROM basic_mystic_code_media WHERE mCodeMediaId = :id")
    suspend fun getInnerMysticCodeItem(id: Int): MysticCodeMediaItem

}