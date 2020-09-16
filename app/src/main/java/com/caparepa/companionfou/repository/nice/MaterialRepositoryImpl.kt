package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem

class MaterialRepositoryImpl : MaterialRepository {
    override suspend fun fetchMaterial(id: Long): MaterialEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMaterials(): List<MaterialEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getMaterialList(currentDate: String, region: String): List<MaterialItem>? {
        TODO("Not yet implemented")
    }
}