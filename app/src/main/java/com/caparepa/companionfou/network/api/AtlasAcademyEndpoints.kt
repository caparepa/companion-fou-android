package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.data.model.basic.ServantItem
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface AtlasAcademyEndpoints {

    /**
     * JSON Download endpoints
     */

    //Export endpoints

    //Attribute Affinity
    @GET("{url_type}/{region}/NiceAttributeRelation.json")
    suspend fun getNiceAttributeRelation(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Attack Rate
    @GET("{url_type}/{region}/NiceClassAttackRate.json")
    suspend fun getNiceClassAttackRate(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Class Affinity
    @GET("{url_type}/{region}/NiceClassRelation.json")
    suspend fun getNiceClassRelation(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Card Details
    @GET("{url_type}/{region}/NiceCard.json")
    suspend fun getNiceCard(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Constants
    @GET("{url_type}/{region}/NiceConstants.json")
    suspend fun getNiceConstants(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Buff Action Info
    @GET("{url_type}/{region}/NiceBuffList.ActionList.json.json")
    suspend fun getNiceBuffActionList(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Master Level info
    @GET("{url_type}/{region}/NiceUserLevel.json")
    suspend fun getNiceUserLevel(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //All enums
    @GET("{url_type}/{region}/nice_enums.json")
    suspend fun getAllEnums(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Trait mapping
    @GET("{url_type}/{region}/nice_trait.json")
    suspend fun getTraitMapping(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Region endpoints

    //Get servants
    @GET("{url_type}/{region}/nice_servant.json")
    suspend fun getNiceServants(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get servants with lore
    @GET("{url_type}/{region}/nice_servant_lore.json")
    suspend fun getNiceServantsWithLore(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Craft Essences
    @GET("{url_type}/{region}/nice_equip.json")
    suspend fun getNiceCraftEssences(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Craft Essences with lore
    @GET("{url_type}/{region}/nice_equip_lore.json")
    suspend fun getNiceCraftEssencesWithLore(
        @Path(
            value = "url_type",
            encoded = true
        ) urlType: String, @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Command Codes
    @GET("{url_type}/{region}/nice_command_code.json")
    suspend fun getNiceCommandCodes(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Materials (items, ascension, etc)
    @GET("{url_type}/{region}/nice_item.json")
    suspend fun getNiceMaterials(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Mystic Codes
    @GET("{url_type}/{region}/nice_mystic_code.json")
    suspend fun getNiceMysticCodes(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Basic data for indexing
    //Get servants
    @GET("{url_type}/{region}/basic_servant.json")
    suspend fun getBasicServants(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>?

    //Get servants
    @GET("{url_type}/{region}/basic_servant_lang_en.json")
    suspend fun getBasicServantsEnglishName(
        @Path(
            value = "url_type",
            encoded = true
        ) urlType: String, @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Craft Essences
    @GET("{url_type}/{region}/basic_equip.json")
    suspend fun getBasicCraftEssences(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    @GET("{url_type}/{region}/basic_command_code.json")
    suspend fun getBasicCommandCodes(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Mystic Codes
    @GET("{url_type}/{region}/basic_mystic_code.json")
    suspend fun getBasicMysticCodes(
        @Path(value = "url_type", encoded = true) urlType: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

}