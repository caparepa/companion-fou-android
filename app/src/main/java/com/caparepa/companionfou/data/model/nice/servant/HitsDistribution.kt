package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class HitsDistribution(
    @Id var _id: Long = 0,
    @SerializedName("arts")
    val arts: List<Int?>? = null,
    @SerializedName("buster")
    val buster: List<Int?>? = null,
    @SerializedName("quick")
    val quick: List<Int?>? = null,
    @SerializedName("extra")
    val extra: List<Int?>? = null
)