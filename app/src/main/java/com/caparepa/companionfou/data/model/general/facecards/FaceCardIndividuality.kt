package com.caparepa.companionfou.data.model.general.facecards

import com.google.gson.annotations.SerializedName

data class FaceCardIndividuality(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
)