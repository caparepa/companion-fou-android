package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.BuffActionListEntity

@Dao
interface BuffActionListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: BuffActionListEntity)

    @Query("SELECT * FROM buff_action_list WHERE id = 0")
    suspend fun getBuffActionListData(): BuffActionListEntity?
}