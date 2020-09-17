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
import com.caparepa.companionfou.data.model.nice.servant.TraitItem
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import org.koin.core.KoinComponent
import org.koin.core.inject
import com.caparepa.companionfou.utils.mapTo
import com.caparepa.companionfou.utils.toJsonString

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

    override suspend fun getApiInfo(currentDate: String): ApiInfo? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getApiInfo(currentDate)
                val body = response.body()
                body?.let {
                    persistApiInfo(it)
                }
                body

            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistApiInfo(item: ApiInfo?) {
        item?.let {
            val entity = ApiInfoEntity(
                it.na?.toJsonString(),
                it.jp?.toJsonString()
            )
            apiInfoDao.upsert(entity)
        }
    }

    override suspend fun fetchApiInfo(): ApiInfoEntity? {
        return apiInfoDao.getApiInfoData()
    }

    override suspend fun getAttributeRelation(
        currentDate: String,
        region: String
    ): AttributeRelation? = withContext(Dispatchers.IO) {
        try {
            val response = api.getAttributeRelation(currentDate)
            val body = response.body()
            body?.let {
                persistAttributeRelation(it)
            }
            body
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistAttributeRelation(item: AttributeRelation?) {
        item?.let {
            val entity = AttributeRelationEntity(
                it.human?.toJsonString(),
                it.sky?.toJsonString(),
                it.earth?.toJsonString(),
                it.beast?.toJsonString()
            )
            attributeRelationDao.upsert(entity)
        }
    }

    override suspend fun fetchAttributeRelation(): AttributeRelationEntity? {
        return attributeRelationDao.getAttributeRelationData()
    }

    override suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getClassAttackRate(currentDate)
                val body = response.body()
                body?.let {
                    persistClassAttackRate(it)
                }
                body
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistClassAttackRate(item: ClassAttackRate?) {
        item?.let {
            val entity = it.mapTo(ClassAttackRateEntity::class.java)
            classAttackRateDao.upsert(entity!!)
        }
    }

    override suspend fun fetchClassAttackRate(): ClassAttackRateEntity? {
        return classAttackRateDao.getClassAttackRateData()
    }

    override suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getClassRelation(currentDate)
                val body = response.body()
                body?.let {
                    persistClassRelation(it)
                }
                body
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistClassRelation(item: ClassRelationList?) {
        item?.let {
            val entity = ClassRelationEntity(
                it.saber?.toJsonString(),
                it.archer?.toJsonString(),
                it.lancer?.toJsonString(),
                it.rider?.toJsonString(),
                it.caster?.toJsonString(),
                it.assassin?.toJsonString(),
                it.berserker?.toJsonString(),
                it.shielder?.toJsonString(),
                it.ruler?.toJsonString(),
                it.alterEgo?.toJsonString(),
                it.avenger?.toJsonString(),
                it.demonGodPillar?.toJsonString(),
                it.beastII?.toJsonString(),
                it.beastI?.toJsonString(),
                it.moonCancer?.toJsonString(),
                it.beastIIIR?.toJsonString(),
                it.foreigner?.toJsonString(),
                it.beastIIIL?.toJsonString(),
                it.beastUnknown?.toJsonString()
            )
            classRelationDao.upsert(entity)
        }
    }

    override suspend fun fetchClassRelation(): ClassRelationEntity? {
        return classRelationDao.getClassAttackRateData()
    }

    override suspend fun getFaceCard(currentDate: String, region: String): FaceCardList? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getFaceCard(currentDate)
                val body = response.body()
                body?.let {
                    persistFaceCard(it)
                }
                body
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistFaceCard(item: FaceCardList?) {
        item?.let {
            val entity = FaceCardEntity(
                it.arts?.toJsonString(),
                it.buster?.toJsonString(),
                it.quick?.toJsonString(),
                it.extra?.toJsonString(),
                it.blank?.toJsonString(),
                it.weak?.toJsonString(),
                it.strength?.toJsonString()
            )
        }
    }

    override suspend fun fetchFaceCard(): FaceCardEntity? {
        return faceCardDao.getFaceCardData()
    }

    override suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistBuffActionList(item: BuffActionList?) {
        item?.let {

        }
    }

    override suspend fun fetchBuffActionList(): BuffActionListEntity? {
        return buffActionListDao.getBuffActionListData()
    }

    override suspend fun getUserLevel(currentDate: String, region: String): UserLevelList? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistUserLevel(item: UserLevelList?) {
        item?.let {

        }
    }

    override suspend fun fetchUserLevel(): UserLevelEntity? {
        return userLevelDao.getUserLevelData()
    }

    override suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistTraitMapping(list: List<TraitItem>?) {
        list?.let {

        }
    }

    override suspend fun fetchTraitMapping(): List<TraitEntity>? {
        return allTraitsDao.getAllTraitsData()
    }

    override suspend fun getAllEnums(currentDate: String, region: String): GameEnums? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistAllEnums(item: GameEnums?) {
        item?.let {

        }
    }

    override suspend fun fetchAllEnums(): GameEnumsEntity? {
        TODO("Not yet implemented")
    }


}