package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.VoiceItem

@Dao
interface VoiceItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(voiceItem: VoiceItem)

    @Query("SELECT * FROM voice_item")
    suspend fun getVoiceItems(): List<VoiceItem>
}