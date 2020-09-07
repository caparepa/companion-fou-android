package com.caparepa.companionfou.repository

import com.caparepa.companionfou.data.db.dao.basic.BasicServantDao
import com.caparepa.companionfou.data.db.entity.basic.CommandCodeItem
import com.caparepa.companionfou.data.db.entity.basic.CraftEssenceItem
import com.caparepa.companionfou.data.db.entity.basic.MysticCodeItem
import com.caparepa.companionfou.data.db.entity.basic.ServantItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent
import org.koin.core.inject

class BasicDataRepositoryImpl : BasicDataRepository, KoinComponent {

    private val api = ApiClient.invoke()
    private val basicServantDao: BasicServantDao by inject()

    //TODO: test this thoroughly!!!
    override suspend fun getBasicServants(currentDate: String, region: String): List<ServantItem>? =
        withContext(Dispatchers.IO) {
            val response = api.getBasicServants(currentDate, region)
            val bodyString = response?.body()?.string()
            val data = bodyString?.toKotlinObject<List<ServantItem>>()
            try {
                data?.let {
                    it.forEach {
                        item ->
                        basicServantDao.upsert(item)
                        logger(LOG_DEBUG, "TAGTAG", "YAHALO!")
                    }
                }
            } catch (e: Exception) {
                logger(LOG_ERROR, "TAGTAG", "FUCK!")
                e.printStackTrace()
            }
            data
        }

    override suspend fun getBasicServantsEnglishName(
        currentDate: String,
        region: String
    ): List<ServantItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicServantsEnglishName(currentDate, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<ServantItem>>()
        data
    }

    override suspend fun getBasicCraftEssences(
        currentDate: String,
        region: String
    ): List<CraftEssenceItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCraftEssences(currentDate, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<CraftEssenceItem>>()
        data
    }

    override suspend fun getBasicCommandCodes(
        currentDate: String,
        region: String
    ): List<CommandCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(currentDate, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<CommandCodeItem>>()
        data
    }

    override suspend fun getBasicMysticCodes(
        currentDate: String,
        region: String
    ): List<MysticCodeItem>? = withContext(Dispatchers.IO) {
        val response = api.getBasicCommandCodes(currentDate, region)
        val bodyString = response?.body()?.string()
        val data = bodyString?.toKotlinObject<List<MysticCodeItem>>()
        data
    }

    private fun persistBasicServantList(servantList: List<ServantItem>?) {

    }
}