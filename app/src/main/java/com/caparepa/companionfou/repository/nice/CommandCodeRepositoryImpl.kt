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

    override suspend fun fetchCommandCode(ccId: Long, server: String): CommandCodeEntity? {
        return commandCodeDao.getCommandCode(ccId, "")
    }

    override suspend fun fetchCommandCodeList(server: String): List<CommandCodeEntity>? {
        return commandCodeDao.getCommandCodes(server)
    }

    override suspend fun getCommandCodeList(
        currentDate: String,
        server: String
    ): List<CommandCodeItem>? = withContext(Dispatchers.IO) {
        try {
            null
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistCommandCodeList(server: String, list: List<CommandCodeItem>?) {
        list?.let {
            it.forEach { item ->
                val entity = CommandCodeEntity(
                    server,
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