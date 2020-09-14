package com.caparepa.companionfou.data.model.nice.mysticcode

import com.caparepa.companionfou.data.model.common.ExtraAssets
import com.caparepa.companionfou.data.model.common.SkillItem
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.annotations.SerializedName

data class MysticCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("maxLv")
    val maxLv: Int? = null,
    @SerializedName("extraAssets")
    val extraAssets: String? = null,
    @SerializedName("skills")
    val skills: String? = null,
    @SerializedName("expRequired")
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
