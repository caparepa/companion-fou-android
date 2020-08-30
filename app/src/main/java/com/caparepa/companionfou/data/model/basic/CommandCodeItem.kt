package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Unique

@Entity
data class CommandCodeItem(
    @Id var _id: Long = 0,
    @Unique
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("face")
    val face: String? = null
)