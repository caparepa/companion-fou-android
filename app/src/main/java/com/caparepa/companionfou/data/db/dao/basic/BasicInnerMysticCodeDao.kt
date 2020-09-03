package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.EmbeddedMysticCodeEntity

@Dao
interface BasicInnerMysticCodeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(innerItem: EmbeddedMysticCodeEntity)

    @Query("SELECT * FROM basic_embedded_mc_item WHERE _id = :id")
    suspend fun getInnerMysticCodeItem(id: Int): EmbeddedMysticCodeEntity

}