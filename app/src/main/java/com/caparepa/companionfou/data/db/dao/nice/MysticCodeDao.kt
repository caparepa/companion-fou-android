package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.MysticCodeEntity

@Dao
interface MysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(code: MysticCodeEntity)

    @Query("SELECT * FROM mystic_code")
    suspend fun getMysticCodeList(): List<MysticCodeEntity>

    @Query("SELECT * FROM mystic_code WHERE id = :id")
    suspend fun getMysticCodeById(id: Long): MysticCodeEntity

    @Query("SELECT * FROM mystic_code WHERE name LIKE :nameQuery")
    suspend fun getMysticCodeByName(nameQuery: String): List<MysticCodeEntity>

}