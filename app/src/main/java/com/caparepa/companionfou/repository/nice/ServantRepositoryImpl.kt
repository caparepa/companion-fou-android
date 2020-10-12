package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.ServantDao
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.toJsonString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class ServantRepositoryImpl(private val servantDao: ServantDao) : ServantRepository, KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchServant(servantId: Long, server: String): ServantEntity? {
        return servantDao.getServantById(servantId,server)
    }

    override suspend fun fetchServantList(server: String): List<ServantEntity>? {
        return servantDao.getServants(server)
    }

    override suspend fun getServantList(currentDate: String, server: String): List<ServantItem>? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getServantsWithLore(currentDate, server)
                val body = response.body()
                body
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistServantList(server: String, list: List<ServantItem>?) {
        list?.let {
            it.forEach { item ->
                val entity = ServantEntity(
                    server,
                    item.id,
                    item.collectionNo,
                    item.name,
                    item.className,
                    item.type,
                    item.rarity,
                    item.cost,
                    item.lvMax,
                    item.extraAssets,
                    item.gender,
                    item.attribute,
                    item.traits?.toJsonString(),
                    item.starAbsorb,
                    item.starGen,
                    item.instantDeathChance,
                    item.cards?.toJsonString(),
                    item.hitsDistribution,
                    item.atkBase,
                    item.atkMax,
                    item.hpBase,
                    item.hpMax,
                    item.growthCurve,
                    item.atkGrowth?.toJsonString(),
                    item.hpGrowth?.toJsonString(),
                    item.bondGrowth?.toJsonString(),
                    item.bondEquip,
                    item.ascensionMaterials,
                    item.skillMaterials,
                    item.costumeMaterials,
                    item.script,
                    item.skills?.toJsonString(),
                    item.classPassive?.toJsonString(),
                    item.noblePhantasms?.toJsonString(),
                    item.profile
                )
                servantDao.upsert(entity)
            }
        }
    }
}