package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MaterialRepositoryImpl : MaterialRepository {
    override suspend fun fetchMaterial(id: Long): MaterialEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMaterialList(): List<MaterialEntity>? {
        TODO("Not yet implemented")
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
        TODO("Not yet implemented")
    }
}