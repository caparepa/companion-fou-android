package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
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
data class CommandCodeEntity(
    @ColumnInfo(name = "id")
    val id: Long? = null,
    @ColumnInfo(name = "collection_no")
    val collectionNo: Long? = null,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "rarity")
    val rarity: Int? = null,
    @ColumnInfo(name = "extra_assets")
    val extraAssets: String? = null,
    @ColumnInfo(name = "skills")
    val skills: String? = null,
    @ColumnInfo(name = "comment")
    val comment: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extraAssets?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }
}