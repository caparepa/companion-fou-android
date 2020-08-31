package com.caparepa.companionfou.repository

import com.caparepa.companionfou.data.model.basic.CommandCodeItem
import com.caparepa.companionfou.data.model.basic.CraftEssenceItem
import com.caparepa.companionfou.data.model.basic.MysticCodeItem
import com.caparepa.companionfou.data.model.basic.ServantItem
import com.caparepa.companionfou.network.api.AtlasApiClient
import com.caparepa.companionfou.utils.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class BasicDataRepositoryImpl : BasicDataRepository, KoinComponent {

    private val api = AtlasApiClient.invoke()

    override suspend fun getBasicServants(urlType: String, region: String): List<ServantItem>? =
        withContext(Dispatchers.Main) {
            val response = api.getBasicServants(urlType, region)
            val stuff = response?.body()?.toJsonString()?.toKotlinObject<List<ServantItem>>()
            stuff
        }

    override suspend fun getBasicServantsEnglishName(
        urlType: String,
        region: String
    ): List<ServantItem>? = withContext(Dispatchers.Main) {
        null
    }

    override suspend fun getBasicCraftEssences(
        urlType: String,
        region: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.Main) {
        null
    }

    override suspend fun getBasicCommandCodes(
        urlType: String,
        region: String
    ): List<CommandCodeItem>? = withContext(Dispatchers.Main) {
        null
    }

    override suspend fun getBasicMysticCodes(
        urlType: String,
        region: String
    ): List<MysticCodeItem>? = withContext(Dispatchers.Main) {
        null
    }
}