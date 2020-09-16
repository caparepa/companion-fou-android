package com.caparepa.companionfou.repository.general

import com.caparepa.companionfou.data.model.general.attackrate.ClassAttackRate
import com.caparepa.companionfou.data.model.general.attribute.AttributeRelation
import com.caparepa.companionfou.data.model.general.buffaction.BuffActionList
import com.caparepa.companionfou.data.model.general.classrelation.ClassRelationList
import com.caparepa.companionfou.data.model.general.facecards.FaceCardList
import com.caparepa.companionfou.data.model.general.other.GameEnums
import com.caparepa.companionfou.data.model.general.userlevel.UserLevelList
import okhttp3.ResponseBody

interface GeneralDataRepository {
    suspend fun getGeneralInfo(currentDate: String, region: String): ResponseBody?
    suspend fun getAttributeRelation(currentDate: String, region: String): AttributeRelation?
    suspend fun getClassAttackRate(currentDate: String, region: String): ClassAttackRate?
    suspend fun getClassRelation(currentDate: String, region: String): ClassRelationList?
    suspend fun getFaceCard(currentDate: String, region: String): FaceCardList?
    suspend fun getConstants(currentDate: String, region: String): ResponseBody?
    suspend fun getBuffActionList(currentDate: String, region: String): BuffActionList?
    suspend fun getUserLevel(currentDate: String, region: String): UserLevelList?
    suspend fun getAllEnums(currentDate: String, region: String): GameEnums?
    suspend fun getTraitMapping(currentDate: String, region: String): ResponseBody?
}