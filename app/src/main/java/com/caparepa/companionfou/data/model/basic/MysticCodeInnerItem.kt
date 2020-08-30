package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class MysticCodeInnerItem(
    @Id var _id: Long = 0,
    @SerializedName("male")
    val male: String? = null,
    @SerializedName("female")
    val female: String? = null
)