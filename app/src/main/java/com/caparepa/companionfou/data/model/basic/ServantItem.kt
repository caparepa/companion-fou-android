package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class ServantItem(
    @Id(assignable = true)
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("className")
    val className: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("face")
    val face: String? = null
)