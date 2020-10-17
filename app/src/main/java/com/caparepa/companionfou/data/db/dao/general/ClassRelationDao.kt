package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.ClassRelationEntity

@Dao
interface ClassRelationDao {

    @Query("DELETE FROM class_relation")
    suspend fun deleteClassRelationTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ClassRelationEntity)

    @Query("SELECT * FROM class_relation WHERE server = :server")
    suspend fun getClassAttackRateData(server: String): ClassRelationEntity?
}