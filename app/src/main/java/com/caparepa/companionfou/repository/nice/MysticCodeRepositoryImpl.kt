package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.MysticCodeDao
import com.caparepa.companionfou.data.db.entity.nice.MysticCode
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class MysticCodeRepositoryImpl(private val mysticCodeDao: MysticCodeDao) : MysticCodeRepository,
    KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchMysticCode(id: Long): MysticCode? {
        return mysticCodeDao.getMysticCodeById(id)
    }

    override suspend fun fetchMysticCodes(): List<MysticCode>? {
        return mysticCodeDao.getMysticCodeList()
    }

    override suspend fun getMysticCodes(
        currentDate: String,
        region: String
    ): List<MysticCode>? = withContext(Dispatchers.IO) {
        try {
            val result = fetchMysticCodes()
            if (result != null)
                result
            else {
                val response = api.getMysticCodes(currentDate, region)
                val body = response.body()
                persistMysticCodeList(body)
                body
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    private suspend fun persistMysticCodeList(mcList: List<MysticCode>?) {
        mcList?.let {
            it.forEach { item ->
                mysticCodeDao.upsert(item)
            }
        }
    }

}