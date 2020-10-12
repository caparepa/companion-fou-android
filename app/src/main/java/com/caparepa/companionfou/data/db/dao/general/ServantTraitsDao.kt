package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.ServantTraitEntity

@Dao
interface ServantTraitsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ServantTraitEntity)

    @Query("SELECT * FROM servant_traits WHERE server = :server")
    suspend fun getAllTraitsData(server: String): ServantTraitEntity?
}