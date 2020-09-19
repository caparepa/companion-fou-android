package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.CommandCodeDao
import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.toJsonString
import org.koin.core.KoinComponent

class CommandCodeRepositoryImpl(private val commandCodeDao: CommandCodeDao) : CommandCodeRepository,
    KoinComponent {

    val api = ApiClient.invoke()

    override suspend fun fetchCommandCode(id: Long): CommandCodeEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCommandCodeList(): List<CommandCodeEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getCommandCodeList(
        currentDate: String,
        region: String
    ): List<CommandCodeItem>? {
        TODO("Not yet implemented")
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