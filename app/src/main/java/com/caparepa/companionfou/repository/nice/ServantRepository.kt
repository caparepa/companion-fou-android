package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem

interface ServantRepository {
    suspend fun fetchServant(servantId: Long, server: String): ServantEntity?
    suspend fun fetchServantList(server: String): List<ServantEntity>?
    suspend fun getServantList(currentDate: String, server: String): List<ServantItem>?
    suspend fun persistServantList(server: String, list: List<ServantItem>?)
}