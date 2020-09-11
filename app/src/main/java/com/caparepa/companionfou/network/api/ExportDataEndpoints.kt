package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.data.db.entity.basic.MysticCodeItem
import com.caparepa.companionfou.data.db.entity.basic.BasicServantItem
import com.caparepa.companionfou.data.db.entity.nice.servant.NiceServantItem
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ExportDataEndpoints {

    /**
     * JSON Download endpoints
     */

    //Export endpoints

    @GET("{current_date}/general/info.json")
    suspend fun getDataInfo(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<ResponseBody>

    //Attribute Affinity
    @GET("{current_date}/{region}/NiceAttributeRelation.json")
    suspend fun getNiceAttributeRelation(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Attack Rate
    @GET("{current_date}/{region}/NiceClassAttackRate.json")
    suspend fun getNiceClassAttackRate(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Class Affinity
    @GET("{current_date}/{region}/NiceClassRelation.json")
    suspend fun getNiceClassRelation(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Card Details
    @GET("{current_date}/{region}/NiceCard.json")
    suspend fun getNiceCard(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Constants
    @GET("{current_date}/{region}/NiceConstants.json")
    suspend fun getNiceConstants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Buff Action Info
    @GET("{current_date}/{region}/NiceBuffList.ActionList.json.json")
    suspend fun getNiceBuffActionList(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Master Level info
    @GET("{current_date}/{region}/NiceUserLevel.json")
    suspend fun getNiceUserLevel(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //All enums
    @GET("{current_date}/{region}/nice_enums.json")
    suspend fun getAllEnums(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Trait mapping
    @GET("{current_date}/{region}/nice_trait.json")
    suspend fun getTraitMapping(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Region endpoints

    //Get servants
    @GET("{current_date}/{region}/nice_servant.json")
    suspend fun getNiceServants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<NiceServantItem>>?

    //Get servants with lore
    @GET("{current_date}/{region}/nice_servant_lore.json")
    suspend fun getNiceServantsWithLore(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Craft Essences
    @GET("{current_date}/{region}/nice_equip.json")
    suspend fun getNiceCraftEssences(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Craft Essences with lore
    @GET("{current_date}/{region}/nice_equip_lore.json")
    suspend fun getNiceCraftEssencesWithLore(
        @Path(
            value = "current_date",
            encoded = true
        ) currentDate: String, @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Command Codes
    @GET("{current_date}/{region}/nice_command_code.json")
    suspend fun getNiceCommandCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Materials (items, ascension, etc)
    @GET("{current_date}/{region}/nice_item.json")
    suspend fun getNiceMaterials(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Mystic Codes
    @GET("{current_date}/{region}/nice_mystic_code.json")
    suspend fun getNiceMysticCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Basic data for indexing
    //Get servants
    @GET("{current_date}/{region}/basic_servant.json")
    suspend fun getBasicServants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<BasicServantItem>>?

    //Get servants
    @GET("{current_date}/{region}/basic_servant_lang_en.json")
    suspend fun getBasicServantsEnglishName(
        @Path(
            value = "current_date",
            encoded = true
        ) currentDate: String, @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Craft Essences
    @GET("{current_date}/{region}/basic_equip.json")
    suspend fun getBasicCraftEssences(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    @GET("{current_date}/{region}/basic_command_code.json")
    suspend fun getBasicCommandCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>

    //Get Mystic Codes
    @GET("{current_date}/{region}/basic_mystic_code.json")
    suspend fun getBasicMysticCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<MysticCodeItem>>?

}