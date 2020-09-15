package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.AllTraitsEntity
import com.caparepa.companionfou.data.db.entity.general.UserLevelEntity

@Dao
interface AllTraitsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: AllTraitsEntity)

    @Query("SELECT * FROM all_traits")
    suspend fun getAllTraits(): List<AllTraitsEntity>?
}