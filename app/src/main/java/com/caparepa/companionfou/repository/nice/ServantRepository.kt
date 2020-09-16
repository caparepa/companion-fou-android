package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem

interface ServantRepository {
    suspend fun fetchServant(id: Long): ServantEntity?
    suspend fun fetchServants(): List<ServantEntity>?
    suspend fun getServants(currentDate: String, region: String): List<ServantItem>?
}