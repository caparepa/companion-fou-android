package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity

@Dao
interface CommandCodeDao {

    @Query("DELETE FROM command_code")
    suspend fun deleteCommandCodeTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(commandCode: CommandCodeEntity)

    @Query("SELECT * FROM command_code WHERE server = :server")
    suspend fun getCommandCodes(server: String): List<CommandCodeEntity>

    @Query("SELECT * FROM command_code WHERE cc_id = :ccId AND server = :server")
    suspend fun getCommandCode(ccId: Long, server: String): CommandCodeEntity
}