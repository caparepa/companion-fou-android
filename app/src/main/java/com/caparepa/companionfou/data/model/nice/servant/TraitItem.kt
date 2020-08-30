package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class TraitItem(
    @Id var _id: Long = 0,
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
)