package com.caparepa.companionfou.repository

import com.caparepa.companionfou.data.db.entity.basic.CommandCodeItem
import com.caparepa.companionfou.data.db.entity.basic.CraftEssenceItem
import com.caparepa.companionfou.data.db.entity.basic.MysticCodeItem
import com.caparepa.companionfou.data.db.entity.basic.ServantItem

interface BasicDataRepository {

    suspend fun fetchBasicServants(): List<ServantItem>?
    suspend fun fetchBasicServantsEnglishName(): List<ServantItem>?
    suspend fun fetchBasicCraftEssences(): List<CraftEssenceItem>?
    suspend fun fetchBasicCommandCodes(): List<CommandCodeItem>?
    suspend fun fetchBasicMysticCodes(): List<MysticCodeItem>?

    suspend fun getBasicServants(currentDate: String, region: String): List<ServantItem>?
    suspend fun getBasicServantsEnglishName(currentDate: String, region: String): List<ServantItem>?
    suspend fun getBasicCraftEssences(currentDate: String, region: String): List<CraftEssenceItem>?
    suspend fun getBasicCommandCodes(currentDate: String, region: String): List<CommandCodeItem>?
    suspend fun getBasicMysticCodes(currentDate: String, region: String): List<MysticCodeItem>?
}