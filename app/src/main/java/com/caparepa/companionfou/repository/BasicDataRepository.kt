package com.caparepa.companionfou.repository

import com.caparepa.companionfou.data.model.basic.CommandCodeItem
import com.caparepa.companionfou.data.model.basic.CraftEssenceItem
import com.caparepa.companionfou.data.model.basic.MysticCodeItem
import com.caparepa.companionfou.data.model.basic.ServantItem

interface BasicDataRepository {
    suspend fun getBasicServants(urlType: String, region: String): List<ServantItem>?
    suspend fun getBasicServantsEnglishName(urlType: String, region: String): List<ServantItem>?
    suspend fun getBasicCraftEssences(urlType: String, region: String): List<CraftEssenceItem>?
    suspend fun getBasicCommandCodes(urlType: String, region: String): List<CommandCodeItem>?
    suspend fun getBasicMysticCodes(urlType: String, region: String): List<MysticCodeItem>?
}