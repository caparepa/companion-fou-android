package com.caparepa.companionfou.repository.general

import com.caparepa.companionfou.data.db.entity.general.*
import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.ApiInfo
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelDetail
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelList
import com.caparepa.companionfou.data.model.nice.servant.TraitItem
import okhttp3.ResponseBody

interface GeneralDataRepository {

    suspend fun getApiInfo(currentDate: String): ApiInfo?
    suspend fun persistApiInfo(item: ApiInfo?)
    suspend fun fetchApiInfo(): ApiInfoEntity?

    suspend fun getAttributeRelation(currentDate: String, region: String): AttributeRelation?
    suspend fun persistAttributeRelation(item: AttributeRelation?)
    suspend fun fetchAttributeRelation(): AttributeRelationEntity?

    suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate?
    suspend fun persistClassAttackRate(item: ClassAttackRate?)
    suspend fun fetchClassAttackRate(): ClassAttackRateEntity?

    suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList?
    suspend fun persistClassRelation(item: ClassRelationList?)
    suspend fun fetchClassRelation(): ClassRelationEntity?

    suspend fun getFaceCard(currentDate: String, region: String): FaceCardList?
    suspend fun persistFaceCard(item: FaceCardList?)
    suspend fun fetchFaceCard(): FaceCardEntity?

    suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList?
    suspend fun persistBuffActionList(item: BuffActionList?)
    suspend fun fetchBuffActionList(): BuffActionListEntity?

    suspend fun getUserLevel(currentDate: String, region: String): Map<Int, UserLevelDetail>?
    suspend fun persistUserLevel(item: Map<Int, UserLevelDetail>?)
    suspend fun fetchUserLevel(): UserLevelEntity?

    suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody?
    suspend fun persistTraitMapping(list: List<TraitItem>?)
    suspend fun fetchTraitMapping(): List<TraitEntity>?

    suspend fun getAllEnums(currentDate: String, region: String): GameEnums?
    suspend fun persistAllEnums(item: GameEnums?)
    suspend fun fetchAllEnums(): GameEnumsEntity?
}