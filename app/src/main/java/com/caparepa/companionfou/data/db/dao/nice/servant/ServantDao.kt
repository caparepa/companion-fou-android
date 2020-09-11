package com.caparepa.companionfou.data.db.dao.nice.servant

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.servant.ServantItem

@Dao
interface ServantDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(servant: ServantItem)

    @Query("SELECT * FROM basic_servant")
    suspend fun getServants(): List<ServantItem>

    @Query("SELECT * FROM basic_servant WHERE mServantId = :id")
    suspend fun getServantById(id: Long): ServantItem

    @Query("SELECT * FROM basic_servant WHERE collectionNo = :collectionNo")
    suspend fun getServantByCollectionNo(collectionNo: Long): ServantItem

    @Query("SELECT * FROM basic_servant WHERE className = :className")
    suspend fun getServantByClass(className: String): List<ServantItem>

    @Query("SELECT * FROM basic_servant WHERE rarity = :rarity")
    suspend fun getServantByRarity(rarity: Int): List<ServantItem>

    @Query("SELECT * FROM basic_servant WHERE type = :servantType")
    suspend fun getServantByType(servantType: String): List<ServantItem>

    @Query("SELECT * FROM basic_servant WHERE className = :className OR rarity = :rarity OR type = :servantType")
    suspend fun getServantByFilter(
        className: String,
        rarity: Int,
        servantType: String
    ): List<ServantItem>
}