package com.caparepa.companionfou.data.db.dao.common

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.common.MaterialEntity

@Dao
interface CommonMaterialDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(materialEntry: MaterialEntity)

    @Query("SELECT * FROM material")
    suspend fun getAllMaterials(): List<MaterialEntity>

    @Query("SELECT * FROM material WHERE _id = :id")
    suspend fun getMaterial(id: Long): MaterialEntity

    //TODO: to query with LIKE, the % % has to be added when calling the method, not here
    @Query("SELECT * FROM material WHERE name LIKE :nameQuery")
    suspend fun getMaterialByName(nameQuery: String): List<MaterialEntity>

    @Query("SELECT * FROM material WHERE type = :materialType")
    suspend fun getMaterialByType(materialType: String): List<MaterialEntity>

}