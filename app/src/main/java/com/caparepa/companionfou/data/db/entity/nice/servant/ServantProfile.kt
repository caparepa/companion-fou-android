package com.caparepa.companionfou.data.db.entity.nice.servant

import com.google.gson.annotations.SerializedName

data class ServantProfile(
    @SerializedName("cv")
    val cv: String? = null,
    @SerializedName("illustrator")
    val illustrator: String? = null,
    @SerializedName("stats")
    val stats: ServantStats? = null,
    @SerializedName("costume")
    val costume: Map<Int, ServantCostumeItem?>? = null,
    @SerializedName("comments")
    val comments: List<CommentItem?>? = null,
    @SerializedName("voices")
    val voices: List<ServantVoiceItem?>? = null
)