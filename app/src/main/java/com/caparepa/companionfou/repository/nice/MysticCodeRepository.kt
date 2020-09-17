package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MysticCodeEntity
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem

interface MysticCodeRepository {
    suspend fun fetchMysticCode(id: Long): MysticCodeEntity?
    suspend fun fetchMysticCodeList(): List<MysticCodeEntity>?
    suspend fun getMysticCodeList(currentDate: String, region: String): List<MysticCodeItem>?
    suspend fun persistMysticCodeList(list: List<MysticCodeItem>?)
}