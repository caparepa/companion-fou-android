package com.caparepa.companionfou.repository.basic

import com.caparepa.companionfou.data.model.basic.BasicCommandCodeItem
import com.caparepa.companionfou.data.model.basic.BasicCraftEssenceItem
import com.caparepa.companionfou.data.model.basic.BasicMysticCodeItem
import com.caparepa.companionfou.data.model.basic.BasicServantItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class BasicDataRepositoryImpl : BasicDataRepository, KoinComponent {

    private val api = ApiClient.invoke()

    //TODO: test this thoroughly!!!
    override suspend fun getBasicServants(currentDate: String, region: String): List<BasicServantItem>? =
        withContext(Dispatchers.IO) {
            val response = api.getBasicServants(currentDate, region)
            val bodyString = response?.body()?.string()
            val data = bodyString?.toKotlinObject<List<BasicServantItem>>()
            data
        }

    override suspend fun getBasicServantsEnglishName(
        currentDate: String,
        region: String
    ): List<BasicServantItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicServantsEnglishName(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<BasicServantItem>>()
        data
    }

    override suspend fun getBasicCraftEssences(
        currentDate: String,
        region: String
    ): List<BasicCraftEssenceItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCraftEssences(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<BasicCraftEssenceItem>>()
        data
    }

    override suspend fun getBasicCommandCodes(
        currentDate: String,
        region: String
    ): List<BasicCommandCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<BasicCommandCodeItem>>()
        data
    }

    override suspend fun getBasicMysticCodes(
        currentDate: String,
        region: String
    ): List<BasicMysticCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(currentDate, region)
        val bodyString = response.body()?.string()
        val data = bodyString?.toKotlinObject<List<BasicMysticCodeItem>>()
        data
    }

    private fun persistBasicServantList(servantList: List<BasicServantItem>?) {

    }
}