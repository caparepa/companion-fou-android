package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem

interface CraftEssenceRepository {
    suspend fun fetchCraftEssence(id: Long): CraftEssenceEntity?
    suspend fun fetchCraftEssences(): List<CraftEssenceEntity>?
    suspend fun getCraftEssenceList(currentDate: String, region: String): List<CraftEssenceItem>?
}