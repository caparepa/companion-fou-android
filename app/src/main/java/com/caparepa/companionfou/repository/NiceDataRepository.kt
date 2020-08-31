package com.caparepa.companionfou.repository

import okhttp3.ResponseBody

interface NiceDataRepository {
    suspend fun getNiceServants(urlType: String, region: String): ResponseBody?
    suspend fun getNiceServantsWithLore(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCraftEssences(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCraftEssencesWithLore(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCommandCodes(urlType: String, region: String): ResponseBody?
    suspend fun getNiceMaterials(urlType: String, region: String): ResponseBody?
    suspend fun getNiceMysticCodes(urlType: String, region: String): ResponseBody?
}