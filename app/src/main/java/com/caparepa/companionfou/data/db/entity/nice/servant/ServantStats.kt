package com.caparepa.companionfou.data.db.entity.nice.servant

import com.google.gson.annotations.SerializedName

data class ServantStats(
    @SerializedName("strength")
    val strength: String? = null,
    @SerializedName("endurance")
    val endurance: String? = null,
    @SerializedName("agility")
    val agility: String? = null,
    @SerializedName("magic")
    val magic: String? = null,
    @SerializedName("luck")
    val luck: String? = null,
    @SerializedName("np")
    val np: String? = null
)