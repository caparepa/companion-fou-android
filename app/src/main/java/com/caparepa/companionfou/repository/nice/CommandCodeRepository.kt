package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CommandCodeEntity
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem

interface CommandCodeRepository {
    suspend fun fetchCommandCode(ccId: Long, server: String): CommandCodeEntity?
    suspend fun fetchCommandCodeList(server: String): List<CommandCodeEntity>?
    suspend fun getCommandCodeList(currentDate: String, server: String): List<CommandCodeItem>?
    suspend fun persistCommandCodeList(server: String, list: List<CommandCodeItem>?)
}