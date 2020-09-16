package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem

class ServantRepositoryImpl : ServantRepository {
    override suspend fun fetchServant(id: Long): ServantEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchServants(): List<ServantEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getServants(currentDate: String, region: String): List<ServantItem>? {
        TODO("Not yet implemented")
    }
}