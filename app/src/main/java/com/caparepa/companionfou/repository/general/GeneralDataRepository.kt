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
    suspend fun getAttributeRelation(urlType: String, region: String): AttributeRelation?
    suspend fun getClassAttackRate(urlType: String, region: String): ClassAttackRate?
    suspend fun getClassRelation(urlType: String, region: String): ClassRelationList?
    suspend fun getFaceCard(urlType: String, region: String): FaceCardList?
    suspend fun getConstants(urlType: String, region: String): ResponseBody?
    suspend fun getBuffActionList(urlType: String, region: String): BuffActionList?
    suspend fun getUserLevel(urlType: String, region: String): UserLevelList?
    suspend fun getAllEnums(urlType: String, region: String): GameEnums?
    suspend fun getTraitMapping(urlType: String, region: String): ResponseBody?
}