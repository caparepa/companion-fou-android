package com.caparepa.companionfou.data.db.entity.nice

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.converters.NiceDataConverter
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "mystic_code"
)
data class MysticCode(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("detail")
    val detail: String,
    @SerializedName("maxLv")
    val maxLv: Int,
    @SerializedName("extraAssets")
    val extraAssets: String,
    @SerializedName("skills")
    val skills: String,
    @SerializedName("expRequired")
    val expRequired: String
) {
    @PrimaryKey(autoGenerate = true)
    var mcId: Long = 0

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