package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.ApiInfoEntity

@Dao
interface ApiInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ApiInfoEntity)

    @Query("SELECT * FROM api_info WHERE id = 0")
    suspend fun getApiInfo(): ApiInfoEntity?
}