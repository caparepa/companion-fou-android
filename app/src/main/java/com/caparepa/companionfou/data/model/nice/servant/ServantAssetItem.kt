package com.caparepa.companionfou.data.model.nice.servant

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class ServantAssetItem(
    @Id var _id: Long = 0,
    @SerializedName("ascension")
    val ascension: Map<Int, String?>? = null,
    @SerializedName("costume")
    val costume: Map<Int, String?>? = null,
    @SerializedName("equip")
    val equip: Map<Int, String?>? = null,
    @SerializedName("cc")
    val cc: Map<Int, String?>? = null
)
