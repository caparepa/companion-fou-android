package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.MaterialDao
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.caparepa.companionfou.network.api.ApiClient
import com.caparepa.companionfou.utils.mapTo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class MaterialRepositoryImpl(private val materialDao: MaterialDao) : MaterialRepository,
    KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchMaterial(id: Long): MaterialEntity? {
        return materialDao.getMaterialById(id)
    }

    override suspend fun fetchMaterialList(): List<MaterialEntity>? {
        return materialDao.getMaterials()
    }

    override suspend fun getMaterialList(currentDate: String, region: String): List<MaterialItem>? =
        withContext(Dispatchers.IO) {
            try {
                null
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }

    override suspend fun persistMaterialList(list: List<MaterialItem>?) {
        list?.let {
            it.forEach { item ->
                val entity = item.mapTo(MaterialEntity::class.java)
                materialDao.upsert(entity!!)
            }
        }
    }
}