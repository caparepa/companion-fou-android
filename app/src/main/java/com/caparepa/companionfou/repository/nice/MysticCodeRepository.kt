package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MysticCodeEntity
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem

interface MysticCodeRepository {
    suspend fun fetchMysticCode(mcId: Long, server: String): MysticCodeEntity?
    suspend fun fetchMysticCodeList(server: String): List<MysticCodeEntity>?
    suspend fun getMysticCodeList(currentDate: String, server: String): List<MysticCodeItem>?
    suspend fun persistMysticCodeList(server: String, list: List<MysticCodeItem>?)
}