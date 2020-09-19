package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.ServantDao
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class ServantRepositoryImpl(private val servantDao: ServantDao) : ServantRepository, KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchServant(id: Long): ServantEntity? {
        return servantDao.getServantById(id)
    }

    override suspend fun fetchServantList(): List<ServantEntity>? {
        return servantDao.getServants()
    }

    override suspend fun getServantList(currentDate: String, region: String): List<ServantItem>? =
        withContext(Dispatchers.IO) {
            try {
                null
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistServantList(list: List<ServantItem>?) {
        TODO("Not yet implemented")
    }
}