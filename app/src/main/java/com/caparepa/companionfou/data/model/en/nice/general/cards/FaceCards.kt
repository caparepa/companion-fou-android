package com.caparepa.companionfou.data.model.en.nice.general.cards


import com.google.gson.annotations.SerializedName

data class FaceCards(
    @SerializedName("arts")
    val arts: FaceCardParamList? = null,
    @SerializedName("buster")
    val buster: FaceCardParamList? = null,
    @SerializedName("quick")
    val quick: FaceCardParamList? = null,
    @SerializedName("extra")
    val extra: FaceCardParamList? = null,
    @SerializedName("blank")
    val blank: FaceCardParamList? = null,
    @SerializedName("weak")
    val weak: FaceCardParamList? = null,
    @SerializedName("strength")
    val strength: FaceCardParamList? = null
)