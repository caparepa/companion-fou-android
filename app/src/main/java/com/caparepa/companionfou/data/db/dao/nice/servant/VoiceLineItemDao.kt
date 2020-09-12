package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.VoiceLineItem

@Dao
interface VoiceLineItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(lineItem: VoiceLineItem)

    @Query("SELECT * FROM basic_servant")
    suspend fun getVoiceLineItems(): List<VoiceLineItem>
}