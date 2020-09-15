package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.AttributeRelationEntity

@Dao
interface AttributeRelationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: AttributeRelationEntity)

    @Query("SELECT * FROM attribute_relation WHERE id = 0")
    suspend fun getAttributeRelationData(): AttributeRelationEntity?
}