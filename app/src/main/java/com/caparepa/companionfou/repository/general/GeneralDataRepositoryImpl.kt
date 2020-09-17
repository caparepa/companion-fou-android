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

class GeneralDataRepositoryImpl : GeneralDataRepository {
    override suspend fun getApiInfo(currentDate: String, region: String): ResponseBody? {
        TODO("Not yet implemented")
    }

    override suspend fun persistApiInfo(item: ApiInfoEntity) {
        TODO("Not yet implemented")
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

    override suspend fun persist(item: AttributeRelationEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchAttributeRelation(): AttributeRelationEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: ClassAttackRateEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchClassAttackRate(): ClassAttackRateEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: ClassRelationEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchClassRelation(): ClassRelationEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getFaceCard(currentDate: String, region: String): FaceCardList? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: FaceCardEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchFaceCard(): FaceCardEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: BuffActionListEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchBuffActionList(): BuffActionListEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: UserLevelEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchUserLevel(): UserLevelEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getUserLevel(currentDate: String, region: String): UserLevelList? {
        TODO("Not yet implemented")
    }

    override suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: AllTraitsEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchTraitMapping(): AllTraitsEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun getAllEnums(currentDate: String, region: String): GameEnums? {
        TODO("Not yet implemented")
    }

    override suspend fun persist(item: GameEnumsEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchAllEnums(): GameEnumsEntity? {
        TODO("Not yet implemented")
    }
}