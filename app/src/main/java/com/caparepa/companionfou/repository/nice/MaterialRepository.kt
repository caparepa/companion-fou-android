package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.MaterialEntity
import com.caparepa.companionfou.data.model.nice.material.MaterialItem

interface MaterialRepository {
    suspend fun fetchMaterial(itemId: Long, server: String): MaterialEntity?
    suspend fun fetchMaterialList(server: String): List<MaterialEntity>?
    suspend fun getMaterialList(currentDate: String, server: String): List<MaterialItem>?
    suspend fun persistMaterialList(server: String, list: List<MaterialItem>?)
}