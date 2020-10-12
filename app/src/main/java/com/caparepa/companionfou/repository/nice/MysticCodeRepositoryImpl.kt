package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.MysticCodeDao
import com.caparepa.companionfou.data.db.entity.nice.MysticCodeEntity
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.toJsonString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class MysticCodeRepositoryImpl(private val mysticCodeDao: MysticCodeDao) : MysticCodeRepository,
    KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchMysticCode(id: Long): MysticCodeEntity? {
        return mysticCodeDao.getMysticCode(id,)
    }

    //TODO: beware of pagination!!!
    override suspend fun fetchMysticCodeList(): List<MysticCodeEntity>? {
        return mysticCodeDao.getMysticCodeList()
    }

    override suspend fun getMysticCodeList(
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

    override suspend fun persistMysticCodeList(list: List<MysticCodeItem>?) {
        list?.let {
            it.forEach { item ->
                val entry = MysticCodeEntity (
                    item.id,
                    item.name,
                    item.detail,
                    item.maxLv,
                    item.extraAssets?.toJsonString(),
                    item.skills?.toJsonString(),
                    item.expRequired?.toJsonString()
                )
                mysticCodeDao.upsert(entry)
            }
        }
    }

}