package com.caparepa.companionfou.repository.general

import com.caparepa.companionfou.data.db.dao.general.*
import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.ApiInfo
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelList
import com.caparepa.companionfou.network.api.ApiClient
import okhttp3.ResponseBody
import org.koin.core.KoinComponent
import org.koin.core.inject

class GeneralDataRepositoryImpl : GeneralDataRepository, KoinComponent {

    //Api
    private val api = ApiClient.invoke()

    //DAOs
    private val allTraitsDao: AllTraitsDao by inject()
    private val apiInfoDao: ApiInfoDao by inject()
    private val attributeRelationDao: AttributeRelationDao by inject()
    private val buffActionListDao: BuffActionListDao by inject()
    private val classAttackRateDao: ClassAttackRateDao by inject()
    private val classRelationDao: ClassRelationDao by inject()
    private val faceCardDao: FaceCardDao by inject()
    private val gameEnumsDao: GameEnumsDao by inject()
    private val userLevelDao: UserLevelDao by inject()

    //Function override

    override suspend fun getApiInfo(currentDate: String, region: String): ApiInfo? {
        TODO("Not yet implemented")
    }

    override suspend fun persistApiInfo(item: ApiInfoEntity?) {
        item?.let {
            apiInfoDao.upsert(it)
        }
    }

    override suspend fun fetchApiInfo(): ApiInfoEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getAttributeRelation(
        currentDate: String,
        region: String
    ): AttributeRelation? {
        TODO("Not yet implemented")
    }

    override suspend fun persistAttributeRelation(item: AttributeRelationEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchAttributeRelation(): AttributeRelationEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate? {
        TODO("Not yet implemented")
    }

    override suspend fun persistClassAttackRate(item: ClassAttackRateEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchClassAttackRate(): ClassAttackRateEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList? {
        TODO("Not yet implemented")
    }

    override suspend fun persistClassRelation(item: ClassRelationEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchClassRelation(): ClassRelationEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getFaceCard(currentDate: String, region: String): FaceCardList? {
        TODO("Not yet implemented")
    }

    override suspend fun persistFaceCard(item: FaceCardEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchFaceCard(): FaceCardEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList? {
        TODO("Not yet implemented")
    }

    override suspend fun persistBuffActionList(item: BuffActionListEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchBuffActionList(): BuffActionListEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getUserLevel(currentDate: String, region: String): UserLevelList? {
        TODO("Not yet implemented")
    }

    override suspend fun persistUserLevel(item: UserLevelEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchUserLevel(): UserLevelEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody? {
        TODO("Not yet implemented")
    }

    override suspend fun persistTraitMapping(item: AllTraitsEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchTraitMapping(): AllTraitsEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getAllEnums(currentDate: String, region: String): GameEnums? {
        TODO("Not yet implemented")
    }

    override suspend fun persistAllEnums(item: GameEnumsEntity?) {
        item?.let {

        }
    }

    override suspend fun fetchAllEnums(): GameEnumsEntity? {
        TODO("Not yet implemented")
    }


}