package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName

data class CommentItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("priority")
    val priority: Int? = null,
    @SerializedName("condMessage")
    val condMessage: String? = null,
    @SerializedName("comment")
    val comment: String? = null,
    @SerializedName("condType")
    val condType: String? = null,
    @SerializedName("condValues")
    val condValues: List<Int?>? = null,
    @SerializedName("condValue2")
    val condValue2: Int? = null
)