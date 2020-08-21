package com.caparepa.companionfou.data.model.en.nice.servant.skills


import com.google.gson.annotations.SerializedName

data class FunctionsItem(
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
    val functvals: List<Any>? = null,
    @SerializedName("funcquestTvals")
    val funcquestTvals: List<Any>? = null,
    @SerializedName("buffs")
    val buffs: List<BuffsItem>? = null,
    @SerializedName("svals")
    val svals: List<SvalsItem>? = null,
    @SerializedName("svals2")
    val svals2: List<SvalsItem>? = null,
    @SerializedName("svals3")
    val svals3: List<SvalsItem>? = null,
    @SerializedName("svals4")
    val svals4: List<SvalsItem>? = null,
    @SerializedName("svals5")
    val svals5: List<SvalsItem>? = null

)