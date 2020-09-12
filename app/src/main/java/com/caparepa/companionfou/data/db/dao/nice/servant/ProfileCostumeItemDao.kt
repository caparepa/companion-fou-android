package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.ProfileCostumeItem

@Dao
interface ProfileCostumeItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(condItem: ProfileCostumeItem)

    @Query("SELECT * FROM basic_servant")
    suspend fun getProfileCostumeItems(): Map<Int, ProfileCostumeItem>
}