package com.caparepa.companionfou.data.model.en.nice.general.cards


import com.google.gson.annotations.SerializedName

data class FaceCardParamList(
    @SerializedName("1")
    val x1: FaceCardParams? = null,
    @SerializedName("2")
    val x2: FaceCardParams? = null,
    @SerializedName("3")
    val x3: FaceCardParams? = null,
    @SerializedName("4")
    val x4: FaceCardParams? = null,
    @SerializedName("5")
    val x5: FaceCardParams? = null
)