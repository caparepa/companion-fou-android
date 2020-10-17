package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.BuffActionListEntity

@Dao
interface BuffActionListDao {

    @Query("DELETE FROM buff_action_list")
    suspend fun deleteBuffActionListTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: BuffActionListEntity)

    @Query("SELECT * FROM buff_action_list WHERE server = :server")
    suspend fun getBuffActionListData(server: String): BuffActionListEntity?
}