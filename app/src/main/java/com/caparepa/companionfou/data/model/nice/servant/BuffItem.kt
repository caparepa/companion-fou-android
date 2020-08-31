package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class BuffItem(
    @SerializedName("id")
    val id: Long? = null,
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
    val vals: List<BaseValItem?>? = null,
    @SerializedName("tvals")
    val tvals: List<BaseValItem?>? = null,
    @SerializedName("ckSelfIndv")
    val ckSelfIndv: List<CkSelfIndvItem?>? = null,
    @SerializedName("ckOpIndv")
    val ckOpIndv: List<CkOpIndvItem?>? = null,
    @SerializedName("maxRate")
    val maxRate: Int? = null
)