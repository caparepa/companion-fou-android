package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity

@Dao
interface MaterialDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(material: MaterialEntity)

    @Query("SELECT * FROM material")
    suspend fun getMaterials(): List<MaterialEntity>

    @Query("SELECT * FROM material WHERE id = :id")
    suspend fun getMaterialById(id: Long): MaterialEntity
}