package com.caparepa.companionfou.data.model.general.facecards

import com.google.gson.String
import com.google.gson.annotations.SerializedName

data class FaceCardList(
    /**
     * Map<Int, FaceCardParams?>?
     */
    @SerializedName("arts")
    val arts: String? = null,
    @SerializedName("buster")
    val buster: String? = null,
    @SerializedName("quick")
    val quick: String? = null,
    @SerializedName("extra")
    val extra: String? = null,
    @SerializedName("blank")
    val blank: String? = null,
    @SerializedName("weak")
    val weak: String? = null,
    @SerializedName("strength")
    val strength: String? = null
)