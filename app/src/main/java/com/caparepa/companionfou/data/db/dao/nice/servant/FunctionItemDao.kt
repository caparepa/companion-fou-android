package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.FunctionItem

@Dao
interface FunctionItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(functionItem: FunctionItem)

    @Query("SELECT * FROM function_item")
    suspend fun getFunctionItem(): List<FunctionItem>
}