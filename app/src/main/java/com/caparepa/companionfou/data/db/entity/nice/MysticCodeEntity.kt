package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toKotlinObject

@Entity(
    tableName = "mystic_code"
)
data class MysticCodeEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long? = null,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "detail")
    val detail: String? = null,
    @ColumnInfo(name = "max_lv")
    val maxLv: Int? = null,
    @ColumnInfo(name = "extra_assets")
    val extraAssets: String? = null,
    /** List<SkillItem?>? **/
    @ColumnInfo(name = "skills")
    val skills: String? = null,
    /** List<Int?>? **/
    @ColumnInfo(name = "exp_required")
    val expRequired: String? = null
) {
    fun getExtraAssets(): ExtraAssets? {
        return this.extraAssets?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.skills?.toKotlinObject()
    }

    fun getExpRequired(): List<Int>? {
        return this.expRequired?.toKotlinObject()
    }
}