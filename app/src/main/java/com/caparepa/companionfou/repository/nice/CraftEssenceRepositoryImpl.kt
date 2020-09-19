package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CraftEssenceRepositoryImpl : CraftEssenceRepository {
    override suspend fun fetchCraftEssence(id: Long): CraftEssenceEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCraftEssenceList(): List<CraftEssenceEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getCraftEssenceList(
        currentDate: String,
        region: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.IO) {
        try {
            null
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistCraftEssenceList(list: List<CraftEssenceItem>?) {
        TODO("Not yet implemented")
    }
}