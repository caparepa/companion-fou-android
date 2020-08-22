package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName

data class Buff(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("buffGroup")
    val buffGroup: Int? = null,
    @SerializedName("vals")
    val vals: List<Val?>? = null,
    @SerializedName("tvals")
    val tvals: List<Tval?>? = null,
    @SerializedName("ckSelfIndv")
    val ckSelfIndv: List<CkSelfIndv?>? = null,
    @SerializedName("ckOpIndv")
    val ckOpIndv: List<CkOpIndvItem?>? = null,
    @SerializedName("maxRate")
    val maxRate: Int? = null
)