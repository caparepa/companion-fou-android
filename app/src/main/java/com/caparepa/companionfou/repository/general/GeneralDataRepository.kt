package com.caparepa.companionfou.repository.general

import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelList
import okhttp3.ResponseBody

interface GeneralDataRepository {

    suspend fun getApiInfo(currentDate: String, region: String): ResponseBody?
    suspend fun persistApiInfo(item: ApiInfoEntity)
    suspend fun fetchApiInfo(): ApiInfoEntity?

    suspend fun getAttributeRelation(currentDate: String, region: String): AttributeRelation?
    suspend fun persist(item: AttributeRelationEntity)
    suspend fun fetchAttributeRelation(): AttributeRelationEntity?

    suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate?
    suspend fun persist(item: ClassAttackRateEntity)
    suspend fun fetchClassAttackRate(): ClassAttackRateEntity?

    suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList?
    suspend fun persist(item: ClassRelationEntity)
    suspend fun fetchClassRelation(): ClassRelationEntity?

    suspend fun getFaceCard(currentDate: String, region: String): FaceCardList?
    suspend fun persist(item: FaceCardEntity)
    suspend fun fetchFaceCard(): FaceCardEntity?

    suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList?
    suspend fun persist(item: BuffActionListEntity)
    suspend fun fetchBuffActionList(): BuffActionListEntity?

    suspend fun persist(item: UserLevelEntity)
    suspend fun fetchUserLevel(): UserLevelEntity?
    suspend fun getUserLevel(currentDate: String, region: String): UserLevelList?

    suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody?
    suspend fun persist(item: AllTraitsEntity)
    suspend fun fetchTraitMapping(): AllTraitsEntity?

    suspend fun getAllEnums(currentDate: String, region: String): GameEnums?
    suspend fun persist(item: GameEnumsEntity)
    suspend fun fetchAllEnums(): GameEnumsEntity?
}