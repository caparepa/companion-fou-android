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

                }
                body

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistApiInfo(item: ApiInfo?) {
        item?.let {
            val entity: ApiInfoEntity? = it.mapTo(ApiInfoEntity::class.java)
            apiInfoDao.upsert(entity!!)
        }
    }

    override suspend fun fetchApiInfo(): ApiInfoEntity? {
        return apiInfoDao.getApiInfo()
    }

    override suspend fun getAttributeRelation(
        currentDate: String,
        region: String
    ): AttributeRelation? = withContext(Dispatchers.IO) {
        try {
            TODO("fou")

        } catch (e: Exception) {
            TODO("fou")
        }
    }

    override suspend fun persistAttributeRelation(item: AttributeRelation?) {
        item?.let {

        }
    }

    override suspend fun fetchAttributeRelation(): AttributeRelationEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistClassAttackRate(item: ClassAttackRate?) {
        item?.let {

        }
    }

    override suspend fun fetchClassAttackRate(): ClassAttackRateEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistClassRelation(item: ClassRelationList?) {
        item?.let {

        }
    }

    override suspend fun fetchClassRelation(): ClassRelationEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getFaceCard(currentDate: String, region: String): FaceCardList? =
        withContext(Dispatchers.IO) {
            try {
                TODO("fou")

            } catch (e: Exception) {
                TODO("fou")
            }
        }

    override suspend fun persistFaceCard(item: FaceCardList?) {
        item?.let {

        }
    }

    override suspend fun fetchFaceCard(): FaceCardEntity? {
        TODO("Not yet implemented")
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
        TODO("Not yet implemented")
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
        TODO("Not yet implemented")
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

    override suspend fun fetchTraitMapping(): AllTraitsEntity? {
        TODO("Not yet implemented")
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