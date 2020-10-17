package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity

@Dao
interface CraftEssenceDao {

    @Query("DELETE FROM craft_essence")
    suspend fun deleteCraftEssenceTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(craftEssence: CraftEssenceEntity)

    @Query("SELECT * FROM craft_essence WHERE server = :server")
    suspend fun getCraftEssences(server: String): List<CraftEssenceEntity>

    @Query("SELECT * FROM craft_essence WHERE ce_id = :ceId AND server = :server")
    suspend fun getCraftEssence(ceId: Long, server: String): CraftEssenceEntity
}