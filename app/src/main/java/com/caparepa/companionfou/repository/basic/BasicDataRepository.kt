package com.caparepa.companionfou.repository.basic

import com.caparepa.companionfou.data.model.basic.BasicCommandCodeItem
import com.caparepa.companionfou.data.model.basic.BasicCraftEssenceItem
import com.caparepa.companionfou.data.model.basic.BasicMysticCodeItem
import com.caparepa.companionfou.data.model.basic.BasicServantItem

interface BasicDataRepository {
    suspend fun getBasicServants(currentDate: String, region: String): List<BasicServantItem>?
    suspend fun getBasicServantsEnglishName(currentDate: String, region: String): List<BasicServantItem>?
    suspend fun getBasicCraftEssences(currentDate: String, region: String): List<BasicCraftEssenceItem>?
    suspend fun getBasicCommandCodes(currentDate: String, region: String): List<BasicCommandCodeItem>?
    suspend fun getBasicMysticCodes(currentDate: String, region: String): List<BasicMysticCodeItem>?
}