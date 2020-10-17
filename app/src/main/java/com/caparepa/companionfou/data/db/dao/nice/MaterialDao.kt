package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity

@Dao
interface MaterialDao {

    @Query("DELETE FROM material")
    suspend fun deleteMaterialTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(material: MaterialEntity)

    @Query("SELECT * FROM material WHERE server = :server")
    suspend fun getMaterials(server: String): List<MaterialEntity>

    @Query("SELECT * FROM material WHERE item_id = :itemId AND server = :server")
    suspend fun getMaterial(itemId: Long, server: String): MaterialEntity
}