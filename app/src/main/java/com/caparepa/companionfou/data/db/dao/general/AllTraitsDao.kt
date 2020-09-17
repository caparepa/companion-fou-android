package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.TraitEntity

@Dao
interface AllTraitsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: TraitEntity)

    @Query("SELECT * FROM all_traits")
    suspend fun getAllTraitsData(): List<TraitEntity>?
}