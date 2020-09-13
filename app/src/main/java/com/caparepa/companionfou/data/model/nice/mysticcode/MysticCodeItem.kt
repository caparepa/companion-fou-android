package com.caparepa.companionfou.data.model.nice.mysticcode

import com.caparepa.companionfou.data.model.nice.common.ExtraAssets
import com.caparepa.companionfou.data.model.nice.common.SkillItem
import com.caparepa.companionfou.utils.toJsonString
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.JsonArray
import com.google.gson.JsonElement
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
    val extraAssets: JsonElement? = null,
    /** List<SkillItem?>? **/
    @SerializedName("skills")
    val skills: JsonArray? = null,
    /** List<Int?>? **/
    @SerializedName("expRequired")
    val expRequired: JsonArray? = null
)
