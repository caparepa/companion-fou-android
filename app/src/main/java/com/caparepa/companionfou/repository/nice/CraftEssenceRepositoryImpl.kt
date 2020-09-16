package com.caparepa.companionfou.repository.nice

import com.caparepa.companionfou.data.db.entity.nice.CraftEssenceEntity
import com.caparepa.companionfou.data.model.nice.craftessence.CraftEssenceItem

class CraftEssenceRepositoryImpl : CraftEssenceRepository {
    override suspend fun fetchCraftEssence(id: Long): CraftEssenceEntity? {
        TODO("Not yet implemented")
    }

    override suspend fun fetchCraftEssences(): List<CraftEssenceEntity>? {
        TODO("Not yet implemented")
    }

    override suspend fun getCraftEssenceList(
        currentDate: String,
        region: String
    ): List<CraftEssenceItem>? {
        TODO("Not yet implemented")
    }
}