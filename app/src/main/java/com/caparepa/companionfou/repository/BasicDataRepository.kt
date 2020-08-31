package com.caparepa.companionfou.repository

import okhttp3.ResponseBody

interface BasicDataRepository {
    suspend fun getBasicServants(urlType: String, region: String): ResponseBody?
    suspend fun getBasicServantsEnglishName(urlType: String, region: String): ResponseBody?
    suspend fun getBasicCraftEssences(urlType: String, region: String): ResponseBody?
    suspend fun getBasicCommandCodes(urlType: String, region: String): ResponseBody?
    suspend fun getBasicMysticCodes(urlType: String, region: String): ResponseBody?
}