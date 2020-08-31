package com.caparepa.companionfou.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody

class ServantDataRepositoryImpl : ServantDataRepository {
    override suspend fun getNiceAttributeRelation(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceClassAttackRate(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceClassRelation(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceCard(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceConstants(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceBuffActionList(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceUserLevel(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getAllEnums(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getTraitMapping(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceServants(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceServantsWithLore(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceCraftEssences(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceCraftEssencesWithLore(
        urlType: String,
        region: String
    ): ResponseBody? {
        return null
    }

    override suspend fun getNiceCommandCodes(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceMaterials(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getNiceMysticCodes(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getBasicServants(urlType: String, region: String): ResponseBody? =
        withContext(Dispatchers.Main) {
            try {
                null
            } catch (e: Exception)  {
                e.printStackTrace()
                null
            }
        }

    override suspend fun getBasicServantsEnglishName(
        urlType: String,
        region: String
    ): ResponseBody? {
        return null
    }

    override suspend fun getBasicCraftEssences(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getBasicCommandCodes(urlType: String, region: String): ResponseBody? {
        return null
    }

    override suspend fun getBasicMysticCodes(urlType: String, region: String): ResponseBody? {
        return null
    }

}