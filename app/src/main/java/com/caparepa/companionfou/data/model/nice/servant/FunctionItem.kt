package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class FunctionItem(
    @SerializedName("funcId")
    val funcId: Long? = null,
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
    val functvals: List<BaseValItem?>? = null,
    @SerializedName("funcquestTvals")
    val funcquestTvals: List<BaseValItem?>? = null,
    @SerializedName("buffs")
    val buffs: List<BuffItem?>? = null,
    @SerializedName("svals")
    val svals: List<BaseSvalItem?>? = null,
    @SerializedName("svals2")
    val svals2: List<BaseSvalItem?>? = null,
    @SerializedName("svals3")
    val svals3: List<BaseSvalItem?>? = null,
    @SerializedName("svals4")
    val svals4: List<BaseSvalItem?>? = null,
    @SerializedName("svals5")
    val svals5: List<BaseSvalItem?>? = null
)