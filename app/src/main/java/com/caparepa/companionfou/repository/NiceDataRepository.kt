package com.caparepa.companionfou.repository

import okhttp3.ResponseBody

interface NiceDataRepository {
    suspend fun getServants(currentDate: String, region: String): ResponseBody?
    suspend fun getServantsWithLore(currentDate: String, region: String): ResponseBody?
    suspend fun getCraftEssences(currentDate: String, region: String): ResponseBody?
    suspend fun getCraftEssencesWithLore(currentDate: String, region: String): ResponseBody?
    suspend fun getCommandCodes(currentDate: String, region: String): ResponseBody?
    suspend fun getMaterials(currentDate: String, region: String): ResponseBody?
    suspend fun getMysticCodes(currentDate: String, region: String): ResponseBody?
}