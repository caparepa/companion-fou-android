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

    @Query("SELECT * FROM mystic_code WHERE server = :server")
    suspend fun getMysticCodeList(server: String): List<MysticCodeEntity>

    @Query("SELECT * FROM mystic_code WHERE mc_id = :mcId AND server = :server")
    suspend fun getMysticCode(mcId: Long, server: String): MysticCodeEntity

    @Query("SELECT * FROM mystic_code WHERE name LIKE :nameQuery AND server = :server")
    suspend fun getMysticCodeByName(nameQuery: String, server: String): List<MysticCodeEntity>

}