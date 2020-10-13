package com.caparepa.companionfou.repository.general

import com.caparepa.companionfou.data.db.dao.general.*
import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.ApiInfo
import com.caparepa.companionfou.data.model.general.other.GameConstants
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelDetail
import com.caparepa.companionfou.data.model.other.LatestApiInfo
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

    private val TAG = "Log@GeneralDataRepositoryImpl"

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
    private val gameConstantsDao: GameConstantsDao by inject()

    //Function override

    override suspend fun getLatestInfo(): LatestApiInfo? = withContext(Dispatchers.IO) {
        try {
            val response = api.getLatestApiInfo()
            response.body()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    override suspend fun getApiInfo(currentDate: String): ApiInfo? =
        withContext(Dispatchers.IO) {
            try {
                val response = api.getApiInfo(currentDate)
                persistApiInfo(response.body())
                response.body()
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistApiInfo(item: ApiInfo?) {
        item?.let {
            logger(LOG_DEBUG, TAG, "persistApiInfo")
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
        server: String,
        currentDate: String
    ): AttributeRelation? = withContext(Dispatchers.IO) {
        try {
            logger(LOG_DEBUG, TAG, "getAttributeRelation OK")
            val response = api.getAttributeRelation(currentDate, server)
            persistAttributeRelation(server, response.body())
            response.body()
        } catch (e: Exception) {
            logger(LOG_DEBUG, TAG, "getAttributeRelation ERROR")
            e.printStackTrace()
            null
        }
    }

    override suspend fun persistAttributeRelation(server: String, item: AttributeRelation?) {
        item?.let {
            val entity = AttributeRelationEntity(
                server,
                it.human?.toJsonString(),
                it.sky?.toJsonString(),
                it.earth?.toJsonString(),
                it.beast?.toJsonString()
            )
            attributeRelationDao.upsert(entity)
        }
    }

    override suspend fun fetchAttributeRelation(server: String): AttributeRelationEntity? {
        return attributeRelationDao.getAttributeRelationData(server)
    }

    override suspend fun getClassAttackRate(server: String, currentDate: String): ClassAttackRate? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getClassAttackRate OK")
                val response = api.getClassAttackRate(currentDate, server)
                persistClassAttackRate(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getClassAttackRate ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistClassAttackRate(server: String, item: ClassAttackRate?) {
        item?.let {
            val entity = ClassAttackRateEntity(
                server,
                it.saber,
                it.archer,
                it.lancer,
                it.rider,
                it.caster,
                it.assassin,
                it.berserker,
                it.shielder,
                it.ruler,
                it.alterEgo,
                it.avenger,
                it.demonGodPillar,
                it.grandCaster,
                it.beastII,
                it.beastI,
                it.moonCancer,
                it.beastIIIR,
                it.foreigner,
                it.beastIIIL,
                it.beastUnknown,
                it.unknown,
                it.all
            )
            classAttackRateDao.upsert(entity)
        }
    }

    override suspend fun fetchClassAttackRate(server: String): ClassAttackRateEntity? {
        return classAttackRateDao.getClassAttackRateData(server)
    }

    override suspend fun getClassRelation(server: String, currentDate: String): ClassRelationList? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getClassRelation OK")
                val response = api.getClassRelation(currentDate, server)
                persistClassRelation(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getClassRelation ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistClassRelation(server: String, item: ClassRelationList?) {
        item?.let {
            val entity = ClassRelationEntity(
                server,
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

    override suspend fun fetchClassRelation(server: String): ClassRelationEntity? {
        return classRelationDao.getClassAttackRateData(server)
    }

    override suspend fun getFaceCard(server: String, currentDate: String): FaceCardList? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getFaceCard OK")
                val response = api.getFaceCard(currentDate, server)
                persistFaceCard(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getFaceCard ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistFaceCard(server: String, item: FaceCardList?) {
        item?.let {
            val entity = FaceCardEntity(
                server,
                it.arts?.toJsonString(),
                it.buster?.toJsonString(),
                it.quick?.toJsonString(),
                it.extra?.toJsonString(),
                it.blank?.toJsonString(),
                it.weak?.toJsonString(),
                it.strength?.toJsonString()
            )
            faceCardDao.upsert(entity)
        }
    }

    override suspend fun fetchFaceCard(server: String): FaceCardEntity? {
        return faceCardDao.getFaceCardData(server)
    }

    override suspend fun getBuffActionList(server: String, currentDate: String): BuffActionList? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getBuffActionList OK")
                val response = api.getBuffActionList(currentDate, server)
                persistBuffActionList(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getBuffActionList ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistBuffActionList(server: String, item: BuffActionList?) {
        item?.let {
            val entity = BuffActionListEntity(
                server,
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

    override suspend fun fetchBuffActionList(server: String): BuffActionListEntity? {
        return buffActionListDao.getBuffActionListData(server)
    }

    override suspend fun getUserLevel(
        server: String,
        currentDate: String
    ): Map<Int, UserLevelDetail>? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getUserLevel OK")
                val response = api.getUserLevel(currentDate, server)
                persistUserLevel(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getUserLevel ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistUserLevel(server: String, item: Map<Int, UserLevelDetail>?) {
        item?.let {
            val entity = UserLevelEntity(server, item.toJsonString())
            userLevelDao.upsert(entity)
        }
    }

    override suspend fun fetchUserLevel(server: String): UserLevelEntity? {
        return userLevelDao.getUserLevelData(server)
    }

    override suspend fun getTraitMapping(server: String, currentDate: String): Map<Int, String>? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getTraitMapping OK")
                val response = api.getTraitMapping(currentDate, server)
                persistTraitMapping(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getTraitMapping ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistTraitMapping(server: String, list: Map<Int, String>?) {
        list?.let {
            val entity = ServantTraitEntity(server, it.toJsonString())
            servantTraitsDao.upsert(entity)
        }
    }

    override suspend fun fetchTraitMapping(server: String): ServantTraitEntity? {
        return servantTraitsDao.getAllTraitsData(server)
    }

    override suspend fun getGameEnums(server: String, currentDate: String): GameEnums? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getGameEnums OK")
                val response = api.getAllEnums(currentDate, server)
                persistGameEnums(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getGameEnums ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistGameEnums(server: String, item: GameEnums?) {
        item?.let {
            val entity = GameEnumsEntity(
                server,
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

    override suspend fun fetchGameEnums(server: String): GameEnumsEntity? {
        return gameEnumsDao.getGameEnumsData(server)
    }

    override suspend fun getGameConstants(server: String, currentDate: String): GameConstants? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getGameConstants OK")
                val response = api.getConstants(currentDate, server)
                persistGameConstants(server, response.body())
                response.body()
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getGameConstants ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistGameConstants(server: String, item: GameConstants?) {
        item?.let {
            val entity = GameConstantsEntity(
                server,
                it.attackRate,
                it.attackRateRandomMax,
                it.attackRateRandomMin,
                it.backsideClassImageId,
                it.backsideSvtEquipImageId,
                it.backsideSvtImageId,
                it.battleEffectIdAvoidance,
                it.battleEffectIdAvoidancePierce,
                it.battleEffectIdInvincible,
                it.battleEffectIdInvinciblePierce,
                it.battleItemDispColumn,
                it.bpExpression,
                it.chainbonusArtsRate,
                it.chainbonusBusterRate,
                it.chainbonusQuick,
                it.commandArts,
                it.commandBuster,
                it.commandCardPrmUpMax,
                it.commandCodeDetachingItemId,
                it.commandQuick,
                it.criticalAttackRate,
                it.criticalIndividuality,
                it.criticalRatePerStar,
                it.criticalStarRate,
                it.criticalTdPointRate,
                it.deckMax,
                it.enemyAttackRateArts,
                it.enemyAttackRateBuster,
                it.enemyAttackRateQuick,
                it.enemyMaxBattleCount,
                it.extraAttackRateGrand,
                it.extraAttackRateSingle,
                it.extraCriticalRate,
                it.followerListExpireAt,
                it.followerRefreshResetTime,
                it.followFriendPoint,
                it.friendNum,
                it.fullTdPoint,
                it.heroineChangecardvoice,
                it.hydeSvtId,
                it.jekyllSvtId,
                it.largeSuccessMultExp,
                it.largeSuccessRate,
                it.mashuChangeQuestId,
                it.mashuChangeWarId,
                it.mashuSvtId1,
                it.mashuSvtId2,
                it.maxBlackListNum,
                it.maxCommandSpell,
                it.maxDropFactor,
                it.maxEventPoint,
                it.maxExpFactor,
                it.maxFriendpoint,
                it.maxFriendpointBoostItemDailyReceive,
                it.maxFriendpointBoostItemUse,
                it.maxFriendshipRank,
                it.maxFriendCode,
                it.maxFriendHistoryNum,
                it.maxFriendShipUpRatio,
                it.maxMana,
                it.maxNearPresentOffsetNum,
                it.maxPresentBoxHistoryNum,
                it.maxPresentBoxNum,
                it.maxPresentReceiveNum,
                it.maxQp,
                it.maxQpDropUpRatio,
                it.maxQpFactor,
                it.maxRarePri,
                it.maxRp,
                it.maxStone,
                it.maxUserCommandCode,
                it.maxUserEquipExpUpRatio,
                it.maxUserItem,
                it.maxUserLv,
                it.maxUserSvt,
                it.maxUserSvtEquip,
                it.maxUserSvtEquipStorage,
                it.maxUserSvtStorage,
                it.menuChange,
                it.overKillNpRate,
                it.overKillStarAdd,
                it.overKillStarRate,
                it.starRateMax,
                it.statusUpAdjustAtk,
                it.statusUpAdjustHp,
                it.statusUpBuff,
                it.superSuccessMultExp,
                it.superSuccessRate,
                it.supportDeckMax,
                it.swimsuitMeltSvtId,
                it.tamamocatStunBuffId,
                it.tamamocatTreasureDeviceId1,
                it.tamamocatTreasureDeviceId2,
                it.temporaryIgnoreSleepModeForTreasureDeviceSvtId1,
                it.temporaryIgnoreSleepModeForTreasureDeviceSvtId2,
                it.treasuredeviceIdMashu3,
                it.userAct,
                it.userCost
            )
            gameConstantsDao.upsert(entity)
        }
    }

    override suspend fun fetchGameConstants(server: String): GameConstantsEntity? {
        return gameConstantsDao.getGameConstantsData(server)
    }

}