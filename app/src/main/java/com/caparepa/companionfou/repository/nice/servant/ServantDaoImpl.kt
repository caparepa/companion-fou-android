package com.caparepa.companionfou.repository.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.ServantItem
import com.caparepa.companionfou.network.api.ApiClient
import org.koin.core.KoinComponent

class ServantDaoImpl : ServantDao, KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchBasicServants(): List<ServantItem>? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchBasicServantsEnglishName(): List<ServantItem>? {
        TODO("Not yet implemented")
    }

    override suspend fun getBasicServants(currentDate: String, region: String): List<ServantItem>? {
        TODO("Not yet implemented")
    }

    override suspend fun getBasicServantsEnglishName(
        currentDate: String,
        region: String
    ): List<ServantItem>? {
        TODO("Not yet implemented")
    }
}