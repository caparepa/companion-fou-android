package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.data.model.nice.servant.ServantItem

interface ServantRepository {
    suspend fun fetchServant(id: Long): ServantEntity?
    suspend fun fetchServantList(): List<ServantEntity>?
    suspend fun getServantList(currentDate: String, region: String): List<ServantItem>?
    suspend fun persistServantList(list: List<ServantItem>?)
}