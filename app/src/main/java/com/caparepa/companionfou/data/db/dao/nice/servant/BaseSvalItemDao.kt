package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.BaseSvalItem

@Dao
interface BaseSvalItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(svalItem: BaseSvalItem)

    @Query("SELECT * FROM base_sval_item")
    suspend fun getBaseSvalItems(): List<BaseSvalItem>
}