package com.caparepa.companionfou.data.db.dao.nice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity

@Dao
interface ServantDao {

    @Query("DELETE FROM servant")
    suspend fun deleteServantTable()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(servant: ServantEntity)

    @Query("SELECT * FROM servant WHERE server = :server")
    suspend fun getServants(server: String): List<ServantEntity>

    @Query("SELECT * FROM servant WHERE servant_id = :servantId AND server = :server")
    suspend fun getServantById(servantId: Long, server: String): ServantEntity

    @Query("SELECT * FROM servant WHERE collection_no = :collectionNo AND server = :server")
    suspend fun getServantByCollectionNo(collectionNo: Long, server: String): ServantEntity

    @Query("SELECT * FROM servant WHERE class_name = :className AND server = :server")
    suspend fun getServantByClass(className: String, server: String): List<ServantEntity>

    @Query("SELECT * FROM servant WHERE rarity = :rarity AND server = :server")
    suspend fun getServantByRarity(rarity: Int, server: String): List<ServantEntity>

    @Query("SELECT * FROM servant WHERE type = :servantType AND server = :server")
    suspend fun getServantByType(servantType: String, server: String): List<ServantEntity>

    @Query("SELECT * FROM servant WHERE class_name = :className OR rarity = :rarity OR type = :servantType AND server = :server")
    suspend fun getServantByFilter(
        className: String,
        rarity: Int,
        servantType: String,
        server: String
    ): List<ServantEntity>
}