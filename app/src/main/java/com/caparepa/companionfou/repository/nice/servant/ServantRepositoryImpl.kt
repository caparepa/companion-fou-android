package com.caparepa.companionfou.repository.nice.servant

import com.caparepa.companionfou.data.db.dao.nice.servant.ServantDao
import com.caparepa.companionfou.data.db.entity.nice.servant.NiceServantItem
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent
import org.koin.core.inject

class ServantRepositoryImpl : ServantRepository, KoinComponent {

    private val api = ApiClient.invoke()
    private val servantDao: ServantDao by inject()

    override suspend fun fetchBasicServants(): List<NiceServantItem>? =
        withContext(Dispatchers.IO) {
            servantDao.getServants()
        }

    override suspend fun fetchBasicServantsEnglishName(): List<NiceServantItem>? {
        TODO("Not yet implemented")
    }

    override suspend fun getBasicServants(currentDate: String, region: String): List<NiceServantItem>? =
        withContext(Dispatchers.IO) {
            val data = try {
                val response = api.getNiceServants(currentDate, region)
                persistBasicServantList(response?.body())
                response?.body()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
            data
        }

    override suspend fun getBasicServantsEnglishName(
        currentDate: String,
        region: String
    ): List<NiceServantItem>? {
        TODO("Not yet implemented")
    }
}