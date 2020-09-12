package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.BuffValItem

@Dao
interface BuffValItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(buffValItem: BuffValItem)

    @Query("SELECT * FROM buff_val_item")
    suspend fun getBuffValItems(): List<BuffValItem>
}