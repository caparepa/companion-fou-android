package com.caparepa.companionfou.repository

import com.caparepa.companionfou.data.model.basic.CommandCodeItem
import com.caparepa.companionfou.data.model.basic.CraftEssenceItem
import com.caparepa.companionfou.data.model.basic.MysticCodeItem
import com.caparepa.companionfou.data.model.basic.ServantItem

interface BasicDataRepository {
    suspend fun getBasicServants(currentDate: String, region: String): List<ServantItem>?
    suspend fun getBasicServantsEnglishName(currentDate: String, region: String): List<ServantItem>?
    suspend fun getBasicCraftEssences(currentDate: String, region: String): List<CraftEssenceItem>?
    suspend fun getBasicCommandCodes(currentDate: String, region: String): List<CommandCodeItem>?
    suspend fun getBasicMysticCodes(currentDate: String, region: String): List<MysticCodeItem>?
}