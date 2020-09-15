package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.common.ExtraAssets
import com.caparepa.companionfou.data.model.common.SkillItem
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "command_code",
    indices = [
        Index(value = ["collection_no"], unique = true)
    ]
)
data class CommandCodeEntity(
    @PrimaryKey
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
    fun getExtraAssetsObj(): ExtraAssets? {
        return this.extraAssets?.toKotlinObject()
    }

    fun getSkillsObj(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }
}