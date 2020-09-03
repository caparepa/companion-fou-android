package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.BasicMysticCode

@Dao
interface BasicMysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(code: BasicMysticCode)

    @Query("SELECT * FROM basic_mystic_code")
    suspend fun getMysticCodeList(): List<BasicMysticCode>

    @Query("SELECT * FROM basic_mystic_code WHERE _id = :id")
    suspend fun getMysticCodeById(id: Long): BasicMysticCode

    @Query("SELECT * FROM basic_mystic_code WHERE name LIKE :nameQuery")
    suspend fun getMysticCodeByName(nameQuery: String): List<BasicMysticCode>

}