package com.caparepa.companionfou.repository

import okhttp3.ResponseBody

interface GeneralDataRepository {
    suspend fun getNiceAttributeRelation(urlType: String, region: String): ResponseBody?
    suspend fun getNiceClassAttackRate(urlType: String, region: String): ResponseBody?
    suspend fun getNiceClassRelation(urlType: String, region: String): ResponseBody?
    suspend fun getNiceCard(urlType: String, region: String): ResponseBody?
    suspend fun getNiceConstants(urlType: String, region: String): ResponseBody?
    suspend fun getNiceBuffActionList(urlType: String, region: String): ResponseBody?
    suspend fun getNiceUserLevel(urlType: String, region: String): ResponseBody?
    suspend fun getAllEnums(urlType: String, region: String): ResponseBody?
    suspend fun getTraitMapping(urlType: String, region: String): ResponseBody?
}