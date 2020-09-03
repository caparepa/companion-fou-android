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

    //TODO: test this thoroughly!!!
    override suspend fun getBasicServants(urlType: String, region: String): List<ServantItem>? =
        withContext(Dispatchers.IO) {
            val response = api.getBasicServants(urlType, region)
            val bodyString = response?.body()?.string()
            val data = bodyString?.toKotlinObject<List<ServantItem>>()
            data
        }

    override suspend fun getBasicServantsEnglishName(
        urlType: String,
        region: String
    ): List<ServantItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicServantsEnglishName(urlType, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<ServantItem>>()
        data
    }

    override suspend fun getBasicCraftEssences(
        urlType: String,
        region: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCraftEssences(urlType, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<CraftEssenceItem>>()
        data
    }

    override suspend fun getBasicCommandCodes(
        urlType: String,
        region: String
    ): List<CommandCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(urlType, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<CommandCodeItem>>()
        data
    }

    override suspend fun getBasicMysticCodes(
        urlType: String,
        region: String
    ): List<MysticCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(urlType, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<MysticCodeItem>>()
        data
    }

    private fun persistBasicServantList(servantList: List<ServantItem>?) {

    }
}