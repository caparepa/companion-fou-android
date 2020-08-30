package com.caparepa.companionfou.data.model.general.userlevel


import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class UserLevelDetail(
    @Id var id: Long = 0,
    @SerializedName("requiredExp")
    val requiredExp: Int? = null,
    @SerializedName("maxAp")
    val maxAp: Int? = null,
    @SerializedName("maxCost")
    val maxCost: Int? = null,
    @SerializedName("maxFriend")
    val maxFriend: Int? = null
)