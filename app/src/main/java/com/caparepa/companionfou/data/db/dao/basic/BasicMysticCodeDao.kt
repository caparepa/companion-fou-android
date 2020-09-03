package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.BasicMysticCodeEntity

@Dao
interface BasicMysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(code: BasicMysticCodeEntity)

    @Query("SELECT * FROM basic_mystic_code")
    suspend fun getMysticCodeList(): List<BasicMysticCodeEntity>

    @Query("SELECT * FROM basic_mystic_code WHERE id = :id")
    suspend fun getMysticCodeById(id: Long): BasicMysticCodeEntity

    @Query("SELECT * FROM basic_mystic_code WHERE name LIKE :nameQuery")
    suspend fun getMysticCodeByName(nameQuery: String): List<BasicMysticCodeEntity>

}