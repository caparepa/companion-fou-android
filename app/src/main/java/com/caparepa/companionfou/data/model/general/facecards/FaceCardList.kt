package com.caparepa.companionfou.data.model.general.facecards

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class FaceCardList(
    /**
     * Map<Int, FaceCardParams?>?
     */
    @SerializedName("arts")
    val arts: JsonElement? = null,
    @SerializedName("buster")
    val buster: JsonElement? = null,
    @SerializedName("quick")
    val quick: JsonElement? = null,
    @SerializedName("extra")
    val extra: JsonElement? = null,
    @SerializedName("blank")
    val blank: JsonElement? = null,
    @SerializedName("weak")
    val weak: JsonElement? = null,
    @SerializedName("strength")
    val strength: JsonElement? = null
)