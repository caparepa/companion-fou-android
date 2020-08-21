package com.caparepa.companionfou.data.model.en.nice.servant.skills


import com.google.gson.annotations.SerializedName

data class BuffsItem(
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
    val vals: List<BuffValsItem>? = null,
    @SerializedName("tvals")
    val tvals: List<BuffValsItem>? = null,
    @SerializedName("ckSelfIndv")
    val ckSelfIndv: List<BuffValsItem>? = null,
    @SerializedName("ckOpIndv")
    val ckOpIndv: List<BuffValsItem>? = null,
    @SerializedName("maxRate")
    val maxRate: Int? = null
)