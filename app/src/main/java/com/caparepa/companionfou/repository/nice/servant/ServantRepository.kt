package com.caparepa.companionfou.repository.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.NiceServantItem

interface ServantRepository {
    suspend fun fetchServants(): List<NiceServantItem>?
    suspend fun fetchServantsEnglishName(): List<NiceServantItem>?

    suspend fun getServants(currentDate: String, region: String): List<NiceServantItem>?
    suspend fun getServantsEnglishName(currentDate: String, region: String): List<NiceServantItem>?
}