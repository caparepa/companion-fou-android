package com.caparepa.companionfou.data.db.entity.nice.servant

import com.google.gson.annotations.SerializedName

data class ServantVoiceItem(
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("voiceLines")
    val voiceLines: List<ServantVoiceLine?>? = null
)