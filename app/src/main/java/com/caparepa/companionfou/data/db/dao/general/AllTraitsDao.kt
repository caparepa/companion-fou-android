package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.TraitEntity

@Dao
interface AllTraitsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: String)

    @Query("SELECT * FROM all_traits WHERE id = 0")
    suspend fun getAllTraitsData(): TraitEntity?
}