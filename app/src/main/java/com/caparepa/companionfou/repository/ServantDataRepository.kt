package com.caparepa.companionfou.repository

import okhttp3.ResponseBody

interface ServantDataRepository {

    suspend fun getNiceAttributeRelation(urlType: String, region: String): ResponseBody?
    suspend fun getNiceClassAttackRate(urlType: String, region: String): ResponseBody?
    suspend fun getNiceClassRelation(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCard(urlType: String, region: String): ResponseBody?
    suspend fun getNiceConstants(urlType: String, region: String): ResponseBody?
    suspend fun getNiceBuffActionList(urlType: String, region: String): ResponseBody?
    suspend fun getNiceUserLevel(urlType: String, region: String): ResponseBody?
    suspend fun getAllEnums(urlType: String, region: String): ResponseBody?
    suspend fun getTraitMapping(urlType: String, region: String): ResponseBody?
    suspend fun getNiceServants(urlType: String, region: String): ResponseBody?
    suspend fun getNiceServantsWithLore(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCraftEssences(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCraftEssencesWithLore(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCommandCodes(urlType: String, region: String): ResponseBody?
    suspend fun getNiceMaterials(urlType: String, region: String): ResponseBody?
    suspend fun getNiceMysticCodes(urlType: String, region: String): ResponseBody?
    suspend fun getBasicServants(urlType: String, region: String): ResponseBody?
    suspend fun getBasicServantsEnglishName(urlType: String, region: String): ResponseBody?
    suspend fun getBasicCraftEssences(urlType: String, region: String): ResponseBody?
    suspend fun getBasicCommandCodes(urlType: String, region: String): ResponseBody?
    suspend fun getBasicMysticCodes(urlType: String, region: String): ResponseBody?

}