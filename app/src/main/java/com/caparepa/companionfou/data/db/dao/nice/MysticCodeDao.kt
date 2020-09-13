package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.MysticCode

@Dao
interface MysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(code: MysticCode)

    @Query("SELECT * FROM mystic_code")
    suspend fun getMysticCodeList(): List<MysticCode>

    @Query("SELECT * FROM mystic_code WHERE id = :id")
    suspend fun getMysticCodeById(id: Long): MysticCode

    @Query("SELECT * FROM mystic_code WHERE name LIKE :nameQuery")
    suspend fun getMysticCodeByName(nameQuery: String): List<MysticCode>

}