package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.MysticCodeItem

@Dao
interface BasicMysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(code: MysticCodeItem)

    @Query("SELECT * FROM basic_mystic_code")
    suspend fun getMysticCodeList(): List<MysticCodeItem>

    @Query("SELECT * FROM basic_mystic_code WHERE mCodeId = :id")
    suspend fun getMysticCodeById(id: Long): MysticCodeItem

    @Query("SELECT * FROM basic_mystic_code WHERE name LIKE :nameQuery")
    suspend fun getMysticCodeByName(nameQuery: String): List<MysticCodeItem>

}