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
import com.caparepa.companionfou.data.model.other.LatestApiInfo

interface GeneralDataRepository {

    suspend fun getLatestInfo(): LatestApiInfo?

    suspend fun getApiInfo(currentDate: String): ApiInfo?
    suspend fun persistApiInfo(item: ApiInfo?)
    suspend fun fetchApiInfo(): ApiInfoEntity?

    suspend fun getAttributeRelation(server: String, currentDate: String): AttributeRelation?
    suspend fun persistAttributeRelation(server: String, item: AttributeRelation?)
    suspend fun fetchAttributeRelation(server: String): AttributeRelationEntity?

    suspend fun getClassAttackRate(server: String, currentDate: String): ClassAttackRate?
    suspend fun persistClassAttackRate(server: String, item: ClassAttackRate?)
    suspend fun fetchClassAttackRate(server: String): ClassAttackRateEntity?

    suspend fun getClassRelation(server: String, currentDate: String): ClassRelationList?
    suspend fun persistClassRelation(server: String, item: ClassRelationList?)
    suspend fun fetchClassRelation(server: String): ClassRelationEntity?

    suspend fun getFaceCard(server: String, currentDate: String): FaceCardList?
    suspend fun persistFaceCard(server: String, item: FaceCardList?)
    suspend fun fetchFaceCard(server: String): FaceCardEntity?

    suspend fun getBuffActionList(server: String, currentDate: String): BuffActionList?
    suspend fun persistBuffActionList(server: String, item: BuffActionList?)
    suspend fun fetchBuffActionList(server: String): BuffActionListEntity?

    suspend fun getUserLevel(server: String, currentDate: String): Map<Int, UserLevelDetail>?
    suspend fun persistUserLevel(server: String, item: Map<Int, UserLevelDetail>?)
    suspend fun fetchUserLevel(server: String): UserLevelEntity?

    suspend fun getTraitMapping(server: String, currentDate: String): Map<Int, String>?
    suspend fun persistTraitMapping(server: String, list: Map<Int, String>?)
    suspend fun fetchTraitMapping(server: String): ServantTraitEntity?

    suspend fun getGameEnums(server: String, currentDate: String): GameEnums?
    suspend fun persistGameEnums(server: String, item: GameEnums?)
    suspend fun fetchGameEnums(server: String): GameEnumsEntity?
}