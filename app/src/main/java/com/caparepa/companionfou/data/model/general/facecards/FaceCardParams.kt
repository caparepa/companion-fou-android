package com.caparepa.companionfou.data.model.general.facecards

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class FaceCardParams(
    @Id var id: Long = 0,
    @SerializedName("individuality")
    val individuality: List<FaceCardIndividuality?>? = null,
    @SerializedName("adjustAtk")
    val adjustAtk: Int? = null,
    @SerializedName("adjustTdGauge")
    val adjustTdGauge: Int? = null,
    @SerializedName("adjustCritical")
    val adjustCritical: Int? = null,
    @SerializedName("addAtk")
    val addAtk: Int? = null,
    @SerializedName("addTdGauge")
    val addTdGauge: Int? = null,
    @SerializedName("addCritical")
    val addCritical: Int? = null
)