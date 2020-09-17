package com.caparepa.companionfou.network.api

import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.ApiInfo
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelList
import com.caparepa.companionfou.data.model.nice.commandcode.CommandCodeItem
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.caparepa.companionfou.data.model.nice.mysticcode.MysticCodeItem
import com.caparepa.companionfou.data.model.nice.servant.ServantMaterial
import com.caparepa.companionfou.data.model.nice.servant.ServantItem
import com.google.gson.JsonElement
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ExportDataEndpoints {

    //Export endpoints

    @GET("{current_date}/general/info.json")
    suspend fun getApiInfo(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<ApiInfo>

    //Attribute Affinity
    @GET("{current_date}/{region}/NiceAttributeRelation.json")
    suspend fun getAttributeRelation(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<AttributeRelation>

    //Attack Rate
    @GET("{current_date}/{region}/NiceClassAttackRate.json")
    suspend fun getClassAttackRate(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<ClassAttackRate>

    //Class Affinity
    @GET("{current_date}/{region}/NiceClassRelation.json")
    suspend fun getClassRelation(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<ClassRelationList>

    //Card Details
    @GET("{current_date}/{region}/NiceCard.json")
    suspend fun getFaceCard(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<FaceCardList>

    //Constants
    @GET("{current_date}/{region}/NiceConstants.json")
    suspend fun getConstants(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<ResponseBody>

    //Buff Action Info
    @GET("{current_date}/{region}/NiceBuffList.ActionList.json.json")
    suspend fun getBuffActionList(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<BuffActionList>

    //Master Level info
    @GET("{current_date}/{region}/NiceUserLevel.json")
    suspend fun getUserLevel(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<UserLevelList>

    //All enums
    @GET("{current_date}/{region}/nice_enums.json")
    suspend fun getAllEnums(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<GameEnums>

    //Trait mapping
    //TODO: the response is a Map<Int, String>?
    @GET("{current_date}/{region}/nice_trait.json")
    suspend fun getTraitMapping(
        @Path(value = "current_date", encoded = true) currentDate: String
    ): Response<Map<Int, String>?>

    //Region endpoints

    //Get servants
    @GET("{current_date}/{region}/nice_servant.json")
    suspend fun getServants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<ServantItem>?>

    //Get servants with lore
    @GET("{current_date}/{region}/nice_servant_lore.json")
    suspend fun getServantsWithLore(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<ServantItem>?>

    //Get Craft Essences
    @GET("{current_date}/{region}/nice_equip.json")
    suspend fun getCraftEssences(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<CraftEssenceItem>?>

    //Get Craft Essences with lore
    @GET("{current_date}/{region}/nice_equip_lore.json")
    suspend fun getCraftEssencesWithLore(
        @Path(
            value = "current_date",
            encoded = true
        ) currentDate: String, @Path(value = "region", encoded = true) region: String
    ): Response<List<CraftEssenceItem>?>

    //Get Command Codes
    @GET("{current_date}/{region}/nice_command_code.json")
    suspend fun getCommandCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<CommandCodeItem>?>

    //Get Materials (items, ascension, etc)
    @GET("{current_date}/{region}/nice_item.json")
    suspend fun getMaterials(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<MaterialItem>?>

    //Get Mystic Codes
    @GET("{current_date}/{region}/nice_mystic_code.json")
    suspend fun getMysticCodes(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<List<MysticCodeItem>?>

    //Basic data for indexing
    //Get servants
    @GET("{current_date}/{region}/basic_servant.json")
    suspend fun getBasicServants(
        @Path(value = "current_date", encoded = true) currentDate: String,
        @Path(value = "region", encoded = true) region: String
    ): Response<ResponseBody>?

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
    ): Response<ResponseBody>

}