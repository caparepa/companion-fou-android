package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.MaterialDao
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.LOG_DEBUG
import com.caparepa.companionfou.utils.logger
import com.caparepa.companionfou.utils.mapTo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class MaterialRepositoryImpl(private val materialDao: MaterialDao) : MaterialRepository,
    KoinComponent {

    private val api = ApiClient.invoke()

    private val TAG = "Log@MaterialRepositoryImpl"

    override suspend fun fetchMaterial(itemId: Long, server: String): MaterialEntity? {
        return materialDao.getMaterial(itemId, server)
    }

    override suspend fun fetchMaterialList(server: String): List<MaterialEntity>? {
        return materialDao.getMaterials(server)
    }

    override suspend fun getMaterialList(currentDate: String, server: String): List<MaterialItem>? =
        withContext(Dispatchers.IO) {
            try {
                logger(LOG_DEBUG, TAG, "getMaterialList OK")
                val response = api.getMaterials(currentDate, server)
                val body = response.body()
                persistMaterialList(server, body)
                body
            } catch (e: Exception) {
                logger(LOG_DEBUG, TAG, "getMaterialList ERROR")
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistMaterialList(server: String, list: List<MaterialItem>?) {
        list?.let {
            it.forEach { item ->
                val entity = item.mapTo(MaterialEntity::class.java)
                materialDao.upsert(entity!!)
            }
        }
    }
}