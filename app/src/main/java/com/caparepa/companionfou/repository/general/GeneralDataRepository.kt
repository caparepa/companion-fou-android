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

    suspend fun fetchApiInfo(): ApiInfoEntity?
    suspend fun getApiInfo(currentDate: String, region: String): ResponseBody?

    suspend fun fetchAttributeRelation(): AttributeRelationEntity?
    suspend fun getAttributeRelation(currentDate: String, region: String): AttributeRelation?

    suspend fun fetchClassAttackRate(): ClassAttackRateEntity?
    suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate?

    suspend fun fetchClassRelation(): ClassRelationEntity?
    suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList?

    suspend fun fetchFaceCard(): FaceCardEntity?
    suspend fun getFaceCard(currentDate: String, region: String): FaceCardList?

    suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList?
    suspend fun fetchBuffActionList(): BuffActionListEntity?

    suspend fun fetchUserLevel(): UserLevelEntity?
    suspend fun getUserLevel(currentDate: String, region: String): UserLevelList?

    suspend fun fetchTraitMapping(): AllTraitsEntity?
    suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody?

    suspend fun fetchAllEnums(): GameEnumsEntity?
    suspend fun getAllEnums(currentDate: String, region: String): GameEnums?
 
}