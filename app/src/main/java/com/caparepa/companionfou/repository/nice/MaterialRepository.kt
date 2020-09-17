package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem

interface MaterialRepository {
    suspend fun fetchMaterial(id: Long): MaterialEntity?
    suspend fun fetchMaterialList(): List<MaterialEntity>?
    suspend fun getMaterialList(currentDate: String, region: String): List<MaterialItem>?
    suspend fun persistMaterialList(list: List<MaterialItem>?)
}