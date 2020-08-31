package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.utils.REGION_JP
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AtlasAcademyEndpoints {

    /**
     * JSON Download endpoints
     */

    //Attribute Affinity
    @GET("${REGION_JP}/NiceAttributeRelation.json")
    suspend fun getNiceAttributeRelation(): Response<ResponseBody>

    //Attack Rate
    @GET("${REGION_JP}/NiceClassAttackRate.json")
    suspend fun getNiceClassAttackRate(): Response<ResponseBody>

    //Class Affinity
    @GET("${REGION_JP}/NiceClassRelation.json")
    suspend fun getNiceClassRelation(): Response<ResponseBody>

    //Card Details
    @GET("${REGION_JP}/NiceCard.json")
    suspend fun getNiceCard(): Response<ResponseBody>

    //Constants
    @GET("${REGION_JP}/NiceConstants.json")
    suspend fun getNiceConstants(): Response<ResponseBody>

    //Buff Action Info
    @GET("${REGION_JP}/NiceBuffList.ActionList.json.json")
    suspend fun getNiceBuffActionList(): Response<ResponseBody>

    //Master Level info
    @GET("${REGION_JP}/NiceUserLevel.json")
    suspend fun getNiceUserLevel(): Response<ResponseBody>

    //All enums
    @GET("${REGION_JP}/nice_enums.json")
    suspend fun getAllEnums(): Response<ResponseBody>

    //Trait mapping
    @GET("${REGION_JP}/nice_trait.json")
    suspend fun getTraitMapping(): Response<ResponseBody>
}