package com.caparepa.companionfou.data.model.general.facecards

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class FaceCardIndividuality(
    @Id(assignable = true)
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
)