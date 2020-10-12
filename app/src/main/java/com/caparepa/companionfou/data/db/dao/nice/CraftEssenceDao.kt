package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity

@Dao
interface CraftEssenceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(craftEssence: CraftEssenceEntity)

    @Query("SELECT * FROM craft_essence")
    suspend fun getCraftEssences(): List<CraftEssenceEntity>

    @Query("SELECT * FROM craft_essence WHERE ce_id = :ceId AND server = :server")
    suspend fun getCraftEssence(ceId: Long, server: String): CraftEssenceEntity
}