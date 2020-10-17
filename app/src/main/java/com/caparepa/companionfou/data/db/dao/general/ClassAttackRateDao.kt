package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.ClassAttackRateEntity

@Dao
interface ClassAttackRateDao {

    @Query("DELETE FROM class_attack_rate")
    suspend fun deleteClassAttackRateTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ClassAttackRateEntity)

    @Query("SELECT * FROM class_attack_rate WHERE server = :server")
    suspend fun getClassAttackRateData(server: String): ClassAttackRateEntity?
}