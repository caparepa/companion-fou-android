package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.GameConstantsEntity

@Dao
interface GameConstantsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: GameConstantsEntity)

    @Query("SELECT * FROM game_enums WHERE server = :server")
    suspend fun getGameConstantsData(server: String): GameConstantsEntity?

}