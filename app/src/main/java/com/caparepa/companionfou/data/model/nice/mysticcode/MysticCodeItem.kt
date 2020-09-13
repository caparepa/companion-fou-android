package com.caparepa.companionfou.data.model.nice.mysticcode

import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toJsonString
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.JsonArray
import com.google.gson.JsonObject
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
    val extraAssets: JsonObject? = null,
    @SerializedName("skills")
    val skills: JsonArray? = null,
    @SerializedName("expRequired")
    val expRequired: JsonArray? = null
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
