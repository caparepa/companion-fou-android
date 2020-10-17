package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.GameConstantsEntity

@Dao
interface GameConstantsDao {

    @Query("DELETE FROM game_constants")
    suspend fun deleteGameConstantsTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: GameConstantsEntity)

    @Query("SELECT * FROM game_constants WHERE server = :server")
    suspend fun getGameConstantsData(server: String): GameConstantsEntity?

}