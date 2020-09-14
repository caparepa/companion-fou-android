package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toJsonString
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken

@Entity(
    tableName = "mystic_code"
)
data class MysticCode(
    val id: Long?,
    val name: String?,
    val detail: String?,
    val max_lv: Int?,
    val extra_assets: String?,
    val mc_skills: String?,
    val exp_required: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mcId: Long = 0

    fun getExtraAssets(): ExtraAssets? {
        return this.extra_assets?.toKotlinObject()
    }

    fun getSkills(): List<SkillItem>? {
        return this.mc_skills?.toKotlinObject()
    }

    fun getExpRequired(): List<Int>? {
        return this.exp_required?.toKotlinObject()
    }
}