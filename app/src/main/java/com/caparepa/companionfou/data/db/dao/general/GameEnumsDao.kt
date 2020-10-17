package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.GameEnumsEntity

@Dao
interface GameEnumsDao {

    @Query("DELETE FROM game_enums")
    suspend fun deleteGameEnumsTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: GameEnumsEntity)

    @Query("SELECT * FROM game_enums WHERE server = :server")
    suspend fun getGameEnumsData(server: String): GameEnumsEntity?

}