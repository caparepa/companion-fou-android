package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName

data class SkillFunction(
    @SerializedName("funcId")
    val funcId: Int? = null,
    @SerializedName("funcType")
    val funcType: String? = null,
    @SerializedName("funcTargetType")
    val funcTargetType: String? = null,
    @SerializedName("funcTargetTeam")
    val funcTargetTeam: String? = null,
    @SerializedName("funcPopupText")
    val funcPopupText: String? = null,
    @SerializedName("funcPopupIcon")
    val funcPopupIcon: String? = null,
    @SerializedName("functvals")
    val functvals: List<Any?>? = null,
    @SerializedName("funcquestTvals")
    val funcquestTvals: List<Any?>? = null,
    @SerializedName("buffs")
    val buffs: List<Buff?>? = null,
    @SerializedName("svals")
    val svals: List<Sval?>? = null
)