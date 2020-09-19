package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.CommandCodeDao
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.toJsonString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class CommandCodeRepositoryImpl(private val commandCodeDao: CommandCodeDao) : CommandCodeRepository,
    KoinComponent {

    val api = ApiClient.invoke()

    override suspend fun fetchCommandCode(id: Long): CommandCodeEntity? {
        return commandCodeDao.getCommandCodeById(id)
    }

    override suspend fun fetchCommandCodeList(): List<CommandCodeEntity>? {
        return commandCodeDao.getCommandCodes()
    }

    override suspend fun getCommandCodeList(
        currentDate: String,
        region: String
    ): List<CommandCodeItem>? = withContext(Dispatchers.IO) {
        try {
            null
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistCommandCodeList(list: List<CommandCodeItem>?) {
        list?.let {
            it.forEach { item ->
                val entity = CommandCodeEntity(
                    item.id,
                    item.collectionNo,
                    item.name,
                    item.rarity,
                    item.extraAssets?.toJsonString(),
                    item.skills?.toJsonString(),
                    item.comment
                )
                commandCodeDao.upsert(entity)
            }
        }
    }
}