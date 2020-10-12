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
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelDetail
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.LOG_DEBUG
import com.caparepa.companionfou.utils.logger
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent
import org.koin.core.inject
import com.caparepa.companionfou.utils.mapTo
import com.caparepa.companionfou.utils.toJsonString

class GeneralDataRepositoryImpl : GeneralDataRepository, KoinComponent {

    //Api
    private val api = ApiClient.invoke()

    //DAOs
    private val servantTraitsDao: ServantTraitsDao by inject()
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
                logger(LOG_DEBUG, "TAGTAG", "JALANDO DATA!")
                val response = api.getApiInfo(currentDate)
                persistApiInfo(response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, "TAGTAG", "NO JALO DATA!")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistApiInfo(item: ApiInfo?) {
        item?.let {
            logger(LOG_DEBUG, "TAGTAG", "METIENDO DATA!")
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
            persistAttributeRelation(response.body())
            response.body()
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
        return attributeRelationDao.getAttributeRelationData(REGION_NA)
    }

    override suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getClassAttackRate(currentDate)
                persistClassAttackRate(response.body())
                response.body()
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
        return classAttackRateDao.getClassAttackRateData(REGION_NA)
    }

    override suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getClassRelation(currentDate)
                persistClassRelation(response.body())
                response.body()
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
        return classRelationDao.getClassAttackRateData(REGION_NA)
    }

    override suspend fun getFaceCard(currentDate: String, region: String): FaceCardList? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getFaceCard(currentDate)
                persistFaceCard(response.body())
                response.body()
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
        return faceCardDao.getFaceCardData(REGION_NA)
    }

    override suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getBuffActionList(currentDate)
                persistBuffActionList(response.body())
                response.body()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistBuffActionList(item: BuffActionList?) {
        item?.let {
            val entity = BuffActionListEntity(
                it.commandAtk?.toJsonString(),
                it.commandDef?.toJsonString(),
                it.atk?.toJsonString(),
                it.defence?.toJsonString(),
                it.defencePierce?.toJsonString(),
                it.specialdefence?.toJsonString(),
                it.damage?.toJsonString(),
                it.damageIndividuality?.toJsonString(),
                it.damageIndividualityActiveonly?.toJsonString(),
                it.selfdamage?.toJsonString(),
                it.criticalDamage?.toJsonString(),
                it.npdamage?.toJsonString(),
                it.givenDamage?.toJsonString(),
                it.receiveDamage?.toJsonString(),
                it.pierceInvincible?.toJsonString(),
                it.invincible?.toJsonString(),
                it.breakAvoidance?.toJsonString(),
                it.avoidance?.toJsonString(),
                it.overwriteBattleclass?.toJsonString(),
                it.overwriteClassrelatioAtk?.toJsonString(),
                it.overwriteClassrelatioDef?.toJsonString(),
                it.commandNpAtk?.toJsonString(),
                it.commandNpDef?.toJsonString(),
                it.dropNp?.toJsonString(),
                it.dropNpDamage?.toJsonString(),
                it.commandStarAtk?.toJsonString(),
                it.commandStarDef?.toJsonString(),
                it.criticalPoint?.toJsonString(),
                it.starweight?.toJsonString(),
                it.turnendNp?.toJsonString(),
                it.turnendStar?.toJsonString(),
                it.turnendHpRegain?.toJsonString(),
                it.turnendHpReduce?.toJsonString(),
                it.gainHp?.toJsonString(),
                it.turnvalNp?.toJsonString(),
                it.grantState?.toJsonString(),
                it.resistanceState?.toJsonString(),
                it.avoidState?.toJsonString(),
                it.donotAct?.toJsonString(),
                it.donotSkill?.toJsonString(),
                it.donotNoble?.toJsonString(),
                it.donotRecovery?.toJsonString(),
                it.individualityAdd?.toJsonString(),
                it.individualitySub?.toJsonString(),
                it.hate?.toJsonString(),
                it.criticalRate?.toJsonString(),
                it.avoidInstantdeath?.toJsonString(),
                it.resistInstantdeath?.toJsonString(),
                it.nonresistInstantdeath?.toJsonString(),
                it.regainNpUsedNoble?.toJsonString(),
                it.functionDead?.toJsonString(),
                it.maxhpRate?.toJsonString(),
                it.maxhpValue?.toJsonString(),
                it.functionWavestart?.toJsonString(),
                it.functionSelfturnend?.toJsonString(),
                it.giveGainHp?.toJsonString(),
                it.functionCommandattack?.toJsonString(),
                it.functionDeadattack?.toJsonString(),
                it.functionEntry?.toJsonString(),
                it.chagetd?.toJsonString(),
                it.grantSubstate?.toJsonString(),
                it.toleranceSubstate?.toJsonString(),
                it.grantInstantdeath?.toJsonString(),
                it.functionDamage?.toJsonString(),
                it.functionReflection?.toJsonString(),
                it.multiattack?.toJsonString(),
                it.giveNp?.toJsonString(),
                it.resistanceDelayNpturn?.toJsonString(),
                it.pierceDefence?.toJsonString(),
                it.gutsHp?.toJsonString(),
                it.funcgainNp?.toJsonString(),
                it.funcHpReduce?.toJsonString(),
                it.functionNpattack?.toJsonString(),
                it.fixCommandcard?.toJsonString(),
                it.donotGainnp?.toJsonString(),
                it.fieldIndividuality?.toJsonString(),
                it.donotActCommandtype?.toJsonString(),
                it.damageEventPoint?.toJsonString()
            )
            buffActionListDao.upsert(entity)
        }
    }

    override suspend fun fetchBuffActionList(): BuffActionListEntity? {
        return buffActionListDao.getBuffActionListData(REGION_NA)
    }

    override suspend fun getUserLevel(
        currentDate: String,
        region: String
    ): Map<Int, UserLevelDetail>? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getUserLevel(currentDate)
                persistUserLevel(response.body())
                response.body()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistUserLevel(item: Map<Int, UserLevelDetail>?) {
        item?.let {
            val entity = UserLevelEntity(item.toJsonString())
            userLevelDao.upsert(entity)
        }
    }

    override suspend fun fetchUserLevel(): UserLevelEntity? {
        return userLevelDao.getUserLevelData(REGION_NA)
    }

    override suspend fun getTraitMapping(currentDate: String, region: String): Map<Int, String>? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getTraitMapping(currentDate)
                persistTraitMapping(response.body())
                response.body()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistTraitMapping(list: Map<Int, String>?) {
        list?.let {
            val entity = ServantTraitEntity(it.toJsonString())
            servantTraitsDao.upsert(entity)
        }
    }

    override suspend fun fetchTraitMapping(): ServantTraitEntity? {
        return servantTraitsDao.getAllTraitsData(REGION_NA)
    }

    override suspend fun getGameEnums(currentDate: String, region: String): GameEnums? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getAllEnums(currentDate)
                persistGameEnums(response.body())
                response.body()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistGameEnums(item: GameEnums?) {
        item?.let {
            val entity = GameEnumsEntity(
                it.niceSvtType?.toJsonString(),
                it.niceSvtFlag?.toJsonString(),
                it.niceSkillType?.toJsonString(),
                it.niceFuncType?.toJsonString(),
                it.funcApplyTarget?.toJsonString(),
                it.niceFuncTargetType?.toJsonString(),
                it.niceBuffType?.toJsonString(),
                it.niceBuffAction?.toJsonString(),
                it.niceBuffLimit?.toJsonString(),
                it.niceClassRelationOverwriteType?.toJsonString(),
                it.niceItemType?.toJsonString(),
                it.niceItemBGType?.toJsonString(),
                it.niceCardType?.toJsonString(),
                it.gender?.toJsonString(),
                it.attribute?.toJsonString(),
                it.svtClass?.toJsonString(),
                it.niceStatusRank?.toJsonString(),
                it.niceCondType?.toJsonString(),
                it.niceVoiceCondType?.toJsonString(),
                it.niceSvtVoiceType?.toJsonString(),
                it.niceQuestType?.toJsonString(),
                it.niceConsumeType?.toJsonString(),
                it.trait?.toJsonString()
            )
            gameEnumsDao.upsert(entity)
        }
    }

    override suspend fun fetchGameEnums(): GameEnumsEntity? {
        return gameEnumsDao.getGameEnumsData(REGION_NA)
    }

}