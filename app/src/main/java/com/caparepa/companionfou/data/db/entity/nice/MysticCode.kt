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
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("maxLv")
    val maxLv: Int?,
    @SerializedName("extraAssets")
    val extra_assets: String?,
    @SerializedName("skills")
    val mc_skills: String?,
    @SerializedName("expRequired")
    val exp_required: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mcId: Long = 0

    fun getExtraAssets(): ExtraAssets? {
        val type = object : TypeToken<ExtraAssets>() {}.type
        return Gson().fromJson<ExtraAssets>(this.extra_assets, type)
    }

    fun getSkills(): List<SkillItem>? {
        val type = object : TypeToken<ExtraAssets>() {}.type
        return Gson().fromJson<List<SkillItem>>(this.mc_skills!!.toJsonString(), type)
    }

    fun getExpRequired(): List<Int>? {
        val type = object : TypeToken<ExtraAssets>() {}.type
        return Gson().fromJson<List<Int>>(this.exp_required!!.toJsonString(), type)
    }
}