package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName
import kotlin.Function

data class Skill(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("coolDown")
    val coolDown: List<Int?>? = null,
    @SerializedName("actIndividuality")
    val actIndividuality: List<Any?>? = null,
    @SerializedName("script")
    val script: Script? = null,
    @SerializedName("functions")
    val functions: List<SkillFunction?>? = null
)