package com.caparepa.companionfou.data.db.dao.common

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.common.MaterialItem

@Dao
interface MaterialDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(materialEntry: MaterialItem)

    @Query("SELECT * FROM material_item")
    suspend fun getAllMaterials(): List<MaterialItem>

    @Query("SELECT * FROM material_item WHERE _id = :id")
    suspend fun getMaterial(id: Long): MaterialItem


}