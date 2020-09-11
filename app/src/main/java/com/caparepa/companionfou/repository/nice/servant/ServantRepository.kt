package com.caparepa.companionfou.repository.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.NiceServantItem

interface ServantRepository {
    suspend fun fetchBasicServants(): List<NiceServantItem>?
    suspend fun fetchBasicServantsEnglishName(): List<NiceServantItem>?

    suspend fun getBasicServants(currentDate: String, region: String): List<NiceServantItem>?
    suspend fun getBasicServantsEnglishName(currentDate: String, region: String): List<NiceServantItem>?
}