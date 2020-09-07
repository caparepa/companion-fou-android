package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.CommandCodeItem

@Dao
interface BasicCommandCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(commandCode: CommandCodeItem)

    @Query("SELECT * FROM basic_command_code")
    suspend fun getAllCommandCodes(): List<CommandCodeItem>

    @Query("SELECT * FROM basic_command_code WHERE id = :id")
    suspend fun getCommandCodeById(id: Long?): CommandCodeItem

    @Query("SELECT * FROM basic_command_code WHERE collectionNo = :collectionNo")
    suspend fun getCommandCodeByCollectionNo(collectionNo: Long?): List<CommandCodeItem>?

    @Query("SELECT * FROM basic_command_code WHERE name LIKE :nameQuery")
    suspend fun getCommandCodesByName(nameQuery: String): List<CommandCodeItem>?

    @Query("SELECT * FROM basic_command_code WHERE rarity = :rarity")
    suspend fun getCommandCodesByRarity(rarity: Int): CommandCodeItem

}