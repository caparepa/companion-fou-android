package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.ApiInfo
import com.caparepa.companionfou.data.model.general.other.GameConstants
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelDetail
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.caparepa.companionfou.data.model.other.LatestApiInfo
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ExportDataEndpoints {

    //Export endpoints
    @GET("api/general/current_date")
    suspend fun getLatestApiInfo(): Response<LatestApiInfo>

    @GET("storage/files/data/{current_date}/info.json")
    suspend fun getApiInfo(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<ApiInfo>

    //Attribute Affinity
    @GET("storage/files/data/{current_date}/{server}/general/NiceAttributeRelation.json")
    suspend fun getAttributeRelation(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<AttributeRelation>

    //Attack Rate
    @GET("storage/files/data/{current_date}/{server}/general/NiceClassAttackRate.json")
    suspend fun getClassAttackRate(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<ClassAttackRate>

    //Class Affinity
    @GET("storage/files/data/{current_date}/{server}/general/NiceClassRelation.json")
    suspend fun getClassRelation(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<ClassRelationList>

    //Card Details
    @GET("storage/files/data/{current_date}/{server}/general/NiceCard.json")
    suspend fun getFaceCard(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<FaceCardList>

    //Constants
    @GET("storage/files/data/{current_date}/{server}/general/NiceConstants.json")
    suspend fun getConstants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<GameConstants>

    //Buff Action Info
    @GET("storage/files/data/{current_date}/{server}/general/NiceBuffList.ActionList.json.json")
    suspend fun getBuffActionList(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<BuffActionList>

    //Master Level info
    @GET("storage/files/data/{current_date}/{server}/general/NiceUserLevel.json")
    suspend fun getUserLevel(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<Map<Int, UserLevelDetail>>

    //All enums
    @GET("storage/files/data/{current_date}/{server}/general/nice_enums.json")
    suspend fun getAllEnums(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<GameEnums>

    //Trait mapping
    //TODO: the response is a Map<Int, String>?
    @GET("storage/files/data/{current_date}/{server}/general/nice_trait.json")
    suspend fun getTraitMapping(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<Map<Int, String>?>

    //Region endpoints

    //Get servants
    @GET("storage/files/data/{current_date}/{server}/nice/nice_servant.json")
    suspend fun getServants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<List<ServantItem>?>

    //Get servants with lore
    @GET("storage/files/data/{current_date}/{server}/nice/nice_servant_lore.json")
    suspend fun getServantsWithLore(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<List<ServantItem>?>

    //Get Craft Essences
    @GET("storage/files/data/{current_date}/{server}/nice/nice_equip.json")
    suspend fun getCraftEssences(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<List<CraftEssenceItem>?>

    //Get Craft Essences with lore
    @GET("storage/files/data/{current_date}/{server}/nice/nice_equip_lore.json")
    suspend fun getCraftEssencesWithLore(
        @Path(
            value = "current_date",
            encoded = true
        ) currentDate: String, @Path(value = "server", encoded = true) server: String
    ): Response<List<CraftEssenceItem>?>

    //Get Command Codes
    @GET("storage/files/data/{current_date}/{server}/nice/nice_command_code.json")
    suspend fun getCommandCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<List<CommandCodeItem>?>

    //Get Materials (items, ascension, etc)
    @GET("storage/files/data/{current_date}/{server}/nice/nice_item.json")
    suspend fun getMaterials(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<List<MaterialItem>?>

    //Get Mystic Codes
    @GET("storage/files/data/{current_date}/{server}/nice/nice_mystic_code.json")
    suspend fun getMysticCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<List<MysticCodeItem>?>

    //Basic data for indexing
    //Get servants
    @GET("storage/files/data/{current_date}/{server}/basic/basic_servant.json")
    suspend fun getBasicServants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<ResponseBody>?

    //Get servants
    @GET("storage/files/data/{current_date}/{server}/basic/basic_servant_lang_en.json")
    suspend fun getBasicServantsEnglishName(
        @Path(
            value = "current_date",
            encoded = true
        ) currentDate: String, @Path(value = "server", encoded = true) server: String
    ): Response<ResponseBody>

    //Get Craft Essences
    @GET("storage/files/data/{current_date}/{server}/basic/basic_equip.json")
    suspend fun getBasicCraftEssences(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<ResponseBody>

    @GET("storage/files/data/{current_date}/{server}/basic/basic_command_code.json")
    suspend fun getBasicCommandCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<ResponseBody>

    //Get Mystic Codes
    @GET("storage/files/data/{current_date}/{server}/basic/basic_mystic_code.json")
    suspend fun getBasicMysticCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "server", encoded = true) server: String
    ): Response<ResponseBody>

}