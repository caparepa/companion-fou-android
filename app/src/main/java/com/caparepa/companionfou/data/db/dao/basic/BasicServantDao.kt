package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.BasicServantEntity

@Dao
interface BasicServantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(servant: BasicServantEntity)

    @Query("SELECT * FROM basic_servant")
    suspend fun getServants(): List<BasicServantEntity>

    @Query("SELECT * FROM basic_servant WHERE _id = :id")
    suspend fun getServantById(id: Long): BasicServantEntity

    @Query("SELECT * FROM basic_servant WHERE collectionNo = :collectionNo")
    suspend fun getServantByCollectionNo(collectionNo: Long): BasicServantEntity

    @Query("SELECT * FROM basic_servant WHERE className = :className")
    suspend fun getServantByClass(className: String): List<BasicServantEntity>

    @Query("SELECT * FROM basic_servant WHERE rarity = :rarity")
    suspend fun getServantByRarity(rarity: Int): List<BasicServantEntity>

    @Query("SELECT * FROM basic_servant WHERE type = :servantType")
    suspend fun getServantByType(servantType: String): List<BasicServantEntity>

    @Query("SELECT * FROM basic_servant WHERE className = :className OR rarity = :rarity OR type = :servantType")
    suspend fun getServantByFilter(
        className: String,
        rarity: Int,
        servantType: String
    ): List<BasicServantEntity>

}