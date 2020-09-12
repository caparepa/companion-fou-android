package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.BuffItem

@Dao
interface BuffItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(buffItem: BuffItem)

    @Query("SELECT * FROM buff_item")
    suspend fun getBuffItems(): List<BuffItem>
}