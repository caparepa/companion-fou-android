package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.BasicServant

@Dao
interface BasicServantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(servant: BasicServant)

    @Query("SELECT * FROM basic_servant")
    suspend fun getServants(): List<BasicServant>

    @Query("SELECT * FROM basic_servant WHERE mServantId = :id")
    suspend fun getServantById(id: Long): BasicServant

    @Query("SELECT * FROM basic_servant WHERE collectionNo = :collectionNo")
    suspend fun getServantByCollectionNo(collectionNo: Long): BasicServant

    @Query("SELECT * FROM basic_servant WHERE className = :className")
    suspend fun getServantByClass(className: String): List<BasicServant>

    @Query("SELECT * FROM basic_servant WHERE rarity = :rarity")
    suspend fun getServantByRarity(rarity: Int): List<BasicServant>

    @Query("SELECT * FROM basic_servant WHERE type = :servantType")
    suspend fun getServantByType(servantType: String): List<BasicServant>

    @Query("SELECT * FROM basic_servant WHERE className = :className OR rarity = :rarity OR type = :servantType")
    suspend fun getServantByFilter(
        className: String,
        rarity: Int,
        servantType: String
    ): List<BasicServant>

}