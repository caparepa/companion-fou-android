package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.MysticCodeDao
import com.caparepa.companionfou.data.db.entity.nice.MysticCode
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem
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

    //TODO: beware of pagination!!!
    override suspend fun fetchMysticCodes(): List<MysticCode>? {
        return mysticCodeDao.getMysticCodeList()
    }

    override suspend fun getMysticCodes(
        currentDate: String,
        region: String
    ): List<MysticCodeItem>? = withContext(Dispatchers.IO) {
        try {
            val response = api.getMysticCodes(currentDate, region)
            val body = response.body()
            persistMysticCodeList(body)
            body
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    private suspend fun persistMysticCodeList(mcList: List<MysticCodeItem>?) {
        mcList?.let {
            it.forEach { item ->
                val entry = MysticCode (
                    item.id,
                    item.name,
                    item.detail,
                    item.maxLv,
                    item.extraAssets.toString(),
                    item.skills.toString(),
                    item.expRequired.toString()
                )
                mysticCodeDao.upsert(entry)
            }
        }
    }

}