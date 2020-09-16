package com.caparepa.companionfou.repository.general

import okhttp3.ResponseBody

interface GeneralDataRepository {
    suspend fun getAttributeRelation(urlType: String, region: String): ResponseBody?
    suspend fun getClassAttackRate(urlType: String, region: String): ResponseBody?
    suspend fun getClassRelation(urlType: String, region: String): ResponseBody?
    suspend fun getFaceCard(urlType: String, region: String): ResponseBody?
    suspend fun getConstants(urlType: String, region: String): ResponseBody?
    suspend fun getBuffActionList(urlType: String, region: String): ResponseBody?
    suspend fun getUserLevel(urlType: String, region: String): ResponseBody?
    suspend fun getAllEnums(urlType: String, region: String): ResponseBody?
    suspend fun getTraitMapping(urlType: String, region: String): ResponseBody?
}