package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MysticCode
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem
import okhttp3.ResponseBody

interface MysticCodeRepository {
    suspend fun fetchMysticCode(id: Long): MysticCode?
    suspend fun fetchMysticCodes(): List<MysticCode>?
    suspend fun getMysticCodes(currentDate: String, region: String): List<MysticCode>?
}