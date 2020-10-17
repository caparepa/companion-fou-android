package com.caparepa.companionfou.data.db.dao.general

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.general.FaceCardEntity

@Dao
interface FaceCardDao {

    @Query("DELETE FROM face_card")
    suspend fun deleteFaceCardTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: FaceCardEntity)

    @Query("SELECT * FROM face_card WHERE server = :server")
    suspend fun getFaceCardData(server: String): FaceCardEntity?
}