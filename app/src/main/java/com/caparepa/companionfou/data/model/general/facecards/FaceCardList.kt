package com.caparepa.companionfou.data.model.general.facecards

import com.google.gson.annotations.SerializedName

data class FaceCardList(
    @SerializedName("arts")
    val arts: Map<Int, FaceCardParams?>? = null,
    @SerializedName("buster")
    val buster: Map<Int, FaceCardParams?>? = null,
    @SerializedName("quick")
    val quick: Map<Int, FaceCardParams?>? = null,
    @SerializedName("extra")
    val extra: Map<Int, FaceCardParams?>? = null,
    @SerializedName("blank")
    val blank: Map<Int, FaceCardParams?>? = null,
    @SerializedName("weak")
    val weak: Map<Int, FaceCardParams?>? = null,
    @SerializedName("strength")
    val strength: Map<Int, FaceCardParams?>? = null
)