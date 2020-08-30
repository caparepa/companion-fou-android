package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class ServantVoiceCond(
    @SerializedName("condType")
    val condType: String? = null,
    @SerializedName("value")
    val value: Int? = null,
    @SerializedName("valueList")
    val valueList: List<Int?>? = null,
    @SerializedName("eventId")
    val eventId: Int? = null
)