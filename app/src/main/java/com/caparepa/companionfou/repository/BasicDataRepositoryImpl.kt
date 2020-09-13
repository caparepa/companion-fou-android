package com.caparepa.companionfou.repository

import com.caparepa.companionfou.data.model.basic.CommandCodeItem
import com.caparepa.companionfou.data.model.basic.CraftEssenceItem
import com.caparepa.companionfou.data.model.basic.MysticCodeItem
import com.caparepa.companionfou.data.model.basic.ServantItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class BasicDataRepositoryImpl : BasicDataRepository, KoinComponent {

    private val api = ApiClient.invoke()

    //TODO: test this thoroughly!!!
    override suspend fun getBasicServants(currentDate: String, region: String): List<ServantItem>? =
        withContext(Dispatchers.IO) {
            val response = api.getBasicServants(currentDate, region)
            val bodyString = response?.body()?.string()
            val data = bodyString?.toKotlinObject<List<ServantItem>>()
            data
        }

    override suspend fun getBasicServantsEnglishName(
        currentDate: String,
        region: String
    ): List<ServantItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicServantsEnglishName(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<ServantItem>>()
        data
    }

    override suspend fun getBasicCraftEssences(
        currentDate: String,
        region: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCraftEssences(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<CraftEssenceItem>>()
        data
    }

    override suspend fun getBasicCommandCodes(
        currentDate: String,
        region: String
    ): List<CommandCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<CommandCodeItem>>()
        data
    }

    override suspend fun getBasicMysticCodes(
        currentDate: String,
        region: String
    ): List<MysticCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<MysticCodeItem>>()
        data
    }

    private fun persistBasicServantList(servantList: List<ServantItem>?) {

    }
}