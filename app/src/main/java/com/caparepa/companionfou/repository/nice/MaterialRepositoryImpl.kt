package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.dao.nice.MaterialDao
import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import com.caparepa.companionfou.network.api.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent

class MaterialRepositoryImpl(private val materialDao: MaterialDao) : MaterialRepository,
    KoinComponent {

    private val api = ApiClient.invoke()

    override suspend fun fetchMaterial(id: Long): MaterialEntity? {
        return materialDao.getMaterialById(id)
    }

    override suspend fun fetchMaterials(): List<MaterialEntity>? {
        return materialDao.getMaterials()
    }

    override suspend fun getMaterialList(currentDate: String, region: String): List<MaterialItem>? =
        withContext(Dispatchers.IO) {
            try {

            } catch (e: Exception) {

            }
            TODO("Not yet implemented")
        }

    private suspend fun persistMaterialList(mList: List<MaterialItem>?) {

    }
}