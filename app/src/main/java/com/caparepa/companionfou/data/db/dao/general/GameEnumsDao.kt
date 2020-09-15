package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.GameEnumsEntity

@Dao
interface GameEnumsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: GameEnumsEntity)

    @Query("SELECT * FROM user_level WHERE id = 0")
    suspend fun getGameEnums(): GameEnumsEntity?

}