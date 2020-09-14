package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.Entity
import androidx.room.Index
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "command_code",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
data class CommandCode(
    val id: Long? = null,
    val collectionNo: Long? = null,
    val name: String? = null,
    val rarity: Int? = null,
    val extra_assets: String? = null,
    val skills: String? = null,
    val comment: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extra_assets?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }
}