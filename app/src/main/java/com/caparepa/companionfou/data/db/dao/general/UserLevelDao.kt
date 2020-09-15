package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.UserLevelEntity

@Dao
interface UserLevelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: UserLevelEntity)

    @Query("SELECT * FROM user_level WHERE id = :id")
    suspend fun getUserLevelData(id: Long): UserLevelEntity?
}