package com.caparepa.companionfou.data.db.dao.basic

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.caparepa.companionfou.data.db.entity.basic.BasicCraftEssence

interface BasicCraftEssenceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(ce: BasicCraftEssence)

    @Query("SELECT * FROM basic_craft_essence")
    suspend fun getCraftEssences(): List<BasicCraftEssence>

    @Query("SELECT * FROM basic_craft_essence WHERE _id = :id")
    suspend fun getCraftEssenceById(id: Long): BasicCraftEssence

    @Query("SELECT * FROM basic_craft_essence WHERE collectionNo = :collectionNo")
    suspend fun getCraftEssenceByCollectionNo(collectionNo: Long): BasicCraftEssence

    @Query("SELECT * FROM basic_craft_essence WHERE type = :ceType")
    suspend fun getCraftEssenceByType(ceType: String): List<BasicCraftEssence>

    @Query("SELECT * FROM basic_craft_essence WHERE name LIKE :name")
    suspend fun getCraftEssenceByName(name: String): List<BasicCraftEssence>

    @Query("SELECT * FROM basic_craft_essence WHERE className = :className")
    suspend fun getCraftEssenceByClassName(className: String): List<BasicCraftEssence>

    @Query("SELECT * FROM basic_craft_essence WHERE rarity = :rarity")
    suspend fun getCraftEssenceByRarity(rarity: Int): List<BasicCraftEssence>

}