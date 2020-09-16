package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem

interface CommandCodeRepository {
    suspend fun fetchCommandCode(id: Long): CommandCodeEntity?
    suspend fun fetchCommandCodes(): List<CommandCodeEntity>?
    suspend fun getCommandCodeList(currentDate: String, region: String): List<CommandCodeItem>?
}