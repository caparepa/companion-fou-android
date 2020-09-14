package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity

@Dao
interface CommandCodeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(commandCode: CommandCodeEntity)

    @Query("SELECT * FROM command_code")
    suspend fun getCommandCodes(): List<CommandCodeEntity>

    @Query("SELECT * FROM command_code WHERE id = :id")
    suspend fun getCommandCodeById(id: Long): CommandCodeEntity
}