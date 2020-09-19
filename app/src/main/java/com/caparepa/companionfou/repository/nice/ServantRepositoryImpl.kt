package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ServantRepositoryImpl : ServantRepository {
    override suspend fun fetchServant(id: Long): ServantEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchServantList(): List<ServantEntity>? {
        TODO("Not yet implemented")
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