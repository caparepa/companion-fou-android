package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.CraftEssenceDao
import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class CraftEssenceRepositoryImpl(private val craftEssenceDao: CraftEssenceDao) :
    CraftEssenceRepository, KoinComponent {

    private val api = ApiClient.invoke()

    private val TAG = "Log@CraftEssenceRepositoryImpl"

    override suspend fun fetchCraftEssence(ceId: Long, server: String): CraftEssenceEntity? {
        return craftEssenceDao.getCraftEssence(ceId, "")
    }

    override suspend fun fetchCraftEssenceList(server: String): List<CraftEssenceEntity>? {
        return craftEssenceDao.getCraftEssences(server)
    }

    override suspend fun getCraftEssenceList(
        currentDate: String,
        server: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.IO) {
        try {
            val response = api.getCraftEssencesWithLore(currentDate, server)
            val body = response.body()
            persistCraftEssenceList(server, body)
            body
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistCraftEssenceList(server: String, list: List<CraftEssenceItem>?) {
        list?.let {
            it.forEach { item ->
                val entity = CraftEssenceEntity(
                    server,
                    item.id,
                    item.collectionNo,
                    item.name,
                    item.type,
                    item.rarity,
                    item.cost,
                    item.lvMax,
                    item.extraAssets,
                    item.atkBase,
                    item.atkMax,
                    item.hpBase,
                    item.hpMax,
                    item.growthCurve,
                    item.atkGrowth.toString(),
                    item.hpGrowth.toString(),
                    item.skills.toString()
                )
            }
        }
    }
}