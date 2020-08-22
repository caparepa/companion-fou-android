package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class FunctionItem(
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
    val functvals: List<ValItem?>? = null,
    @SerializedName("funcquestTvals")
    val funcquestTvals: List<ValItem?>? = null,
    @SerializedName("buffs")
    val buffs: List<BuffItem?>? = null,
    @SerializedName("svals")
    val svals: List<SvalItem?>? = null,
    @SerializedName("svals2")
    val svals2: List<SvalItem?>? = null,
    @SerializedName("svals3")
    val svals3: List<SvalItem?>? = null,
    @SerializedName("svals4")
    val svals4: List<SvalItem?>? = null,
    @SerializedName("svals5")
    val svals5: List<SvalItem?>? = null
)