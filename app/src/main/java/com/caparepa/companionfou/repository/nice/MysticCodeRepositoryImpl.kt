package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MysticCode
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem

class MysticCodeRepositoryImpl : MysticCodeRepository {
    override suspend fun fetchMysticCode(id: Long): MysticCode? {
        //TODO("Not yet implemented")
        return null
    }

    override suspend fun fetchMysticCodes(): List<MysticCode>? {
        //TODO("Not yet implemented")
        return null
    }

    override suspend fun getMysticCodes(
        currentDate: String,
        region: String
    ): List<MysticCode>? {
        //TODO("Not yet implemented")
        return null
    }

    suspend fun persistMysticCodeList(list: List<MysticCodeItem>?) {
        //TODO("Not yet implemented")
    }

}