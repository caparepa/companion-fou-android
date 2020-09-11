package com.caparepa.companionfou.repository.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.ServantItem

interface ServantDao {
    suspend fun fetchBasicServants(): List<ServantItem>?
    suspend fun fetchBasicServantsEnglishName(): List<ServantItem>?

    suspend fun getBasicServants(currentDate: String, region: String): List<ServantItem>?
    suspend fun getBasicServantsEnglishName(currentDate: String, region: String): List<ServantItem>?
}