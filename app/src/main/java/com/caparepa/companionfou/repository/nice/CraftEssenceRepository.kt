package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem

interface CraftEssenceRepository {
    suspend fun fetchCraftEssence(ceId: Long, server: String): CraftEssenceEntity?
    suspend fun fetchCraftEssenceList(server: String): List<CraftEssenceEntity>?
    suspend fun getCraftEssenceList(currentDate: String, server: String): List<CraftEssenceItem>?
    suspend fun persistCraftEssenceList(server: String, list: List<CraftEssenceItem>?)
}