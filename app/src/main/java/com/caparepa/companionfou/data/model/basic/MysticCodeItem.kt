package com.caparepa.companionfou.data.model.basic

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Unique

@Entity
data class MysticCodeItem(
    @Id var _id: Long = 0,
    @Unique
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("item")
    val item: MysticCodeInnerItem? = null
)
