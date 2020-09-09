package com.caparepa.companionfou.data.db.entity.general.userlevel

import com.google.gson.annotations.SerializedName

data class UserLevelDetail(
    @SerializedName("requiredExp")
    val requiredExp: Int? = null,
    @SerializedName("maxAp")
    val maxAp: Int? = null,
    @SerializedName("maxCost")
    val maxCost: Int? = null,
    @SerializedName("maxFriend")
    val maxFriend: Int? = null
)