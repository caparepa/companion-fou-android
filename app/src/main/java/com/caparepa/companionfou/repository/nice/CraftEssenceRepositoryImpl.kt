package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.CraftEssenceDao
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class CraftEssenceRepositoryImpl(private val craftEssenceDao: CraftEssenceDao) : CraftEssenceRepository, KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchCraftEssence(ceId: Long, server: String): CraftEssenceEntity? {
        return craftEssenceDao.getCraftEssence(ceId, "")
    }

    override suspend fun fetchCraftEssenceList(server: String): List<CraftEssenceEntity>? {
        return craftEssenceDao.getCraftEssences()
    }

    override suspend fun getCraftEssenceList(
        currentDate: String,
        server: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.IO) {
        try {
            null
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistCraftEssenceList(server: String, list: List<CraftEssenceItem>?) {
        TODO("Not yet implemented")
    }
}