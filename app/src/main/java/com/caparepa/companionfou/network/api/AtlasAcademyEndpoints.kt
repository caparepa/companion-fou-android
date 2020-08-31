package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.utils.REGION_JP
import com.caparepa.companionfou.utils.REGION_NA
import com.caparepa.companionfou.utils.URL_EXPORT_DIR
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AtlasAcademyEndpoints {

    /**
     * JSON Download endpoints
     */

    //Export endpoints

    //Attribute Affinity
    @GET("/NiceAttributeRelation.json")
    suspend fun getNiceAttributeRelation(): Response<ResponseBody>

    //Attack Rate
    @GET("/NiceClassAttackRate.json")
    suspend fun getNiceClassAttackRate(): Response<ResponseBody>

    //Class Affinity
    @GET("/NiceClassRelation.json")
    suspend fun getNiceClassRelation(): Response<ResponseBody>

    //Card Details
    @GET("/NiceCard.json")
    suspend fun getNiceCard(): Response<ResponseBody>

    //Constants
    @GET("/NiceConstants.json")
    suspend fun getNiceConstants(): Response<ResponseBody>

    //Buff Action Info
    @GET("/NiceBuffList.ActionList.json.json")
    suspend fun getNiceBuffActionList(): Response<ResponseBody>

    //Master Level info
    @GET("/NiceUserLevel.json")
    suspend fun getNiceUserLevel(): Response<ResponseBody>

    //All enums
    @GET("/nice_enums.json")
    suspend fun getAllEnums(): Response<ResponseBody>

    //Trait mapping
    @GET("/nice_trait.json")
    suspend fun getTraitMapping(): Response<ResponseBody>

    //Region endpoints

    //Get servants
    @GET("/nice_servant.json")
    suspend fun getNiceServants(): Response<ResponseBody>

    //Get servants with lore
    @GET("/nice_servant_lore.json")
    suspend fun getNiceServantsWithLore(): Response<ResponseBody>

    //Get Craft Essences
    @GET("/nice_equip.json")
    suspend fun getNiceCraftEssences(): Response<ResponseBody>

    //Get Craft Essences with lore
    @GET("/nice_equip_lore.json")
    suspend fun getNiceCraftEssencesWithLore(): Response<ResponseBody>

    //Get Command Codes
    @GET("/nice_command_code.json")
    suspend fun getNiceCommandCodes(): Response<ResponseBody>

    //Get Materials (items, ascension, etc)
    @GET("/nice_item.json")
    suspend fun getNiceMaterials(): Response<ResponseBody>

    //Get Mystic Codes
    @GET("/nice_mystic_code.json")
    suspend fun getNiceMysticCodes(): Response<ResponseBody>

    //Basic data for indexing
    //Get servants
    @GET("/basic_servant.json")
    suspend fun getBasicServants(): Response<ResponseBody>

    //Get servants
    @GET("/basic_servant_lang_en.json")
    suspend fun getBasicServantsEnglishName(): Response<ResponseBody>

    //Get Craft Essences
    @GET("/basic_equip.json")
    suspend fun getBasicCraftEssences(): Response<ResponseBody>

    @GET("/basic_command_code.json")
    suspend fun getBasicCommandCodes(): Response<ResponseBody>

    //Get Mystic Codes
    @GET("/basic_mystic_code.json")
    suspend fun getBasicMysticCodes(): Response<ResponseBody>

}