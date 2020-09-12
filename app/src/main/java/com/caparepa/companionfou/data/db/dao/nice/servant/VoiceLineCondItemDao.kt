package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.VoiceLineCondItem

@Dao
interface VoiceLineCondItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(condItem: VoiceLineCondItem)

    @Query("SELECT * FROM voiceline_cond_item")
    suspend fun getVoiceLineCondItems(): List<VoiceLineCondItem>
}