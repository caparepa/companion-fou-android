package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem

class CommandCodeRepositoryImpl : CommandCodeRepository {
    override suspend fun fetchCommandCode(id: Long): CommandCodeEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCommandCodes(): List<CommandCodeEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getCommandCodeList(
        currentDate: String,
        region: String
    ): List<CommandCodeItem>? {
        TODO("Not yet implemented")
    }
}