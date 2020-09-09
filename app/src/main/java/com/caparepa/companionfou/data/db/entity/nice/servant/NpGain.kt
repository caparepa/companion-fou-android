package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "np_gain"
)
data class NpGain(
    @SerializedName("buster")
    val buster: List<Int?>? = null,
    @SerializedName("arts")
    val arts: List<Int?>? = null,
    @SerializedName("quick")
    val quick: List<Int?>? = null,
    @SerializedName("extra")
    val extra: List<Int?>? = null,
    @SerializedName("defence")
    val defence: List<Int?>? = null,
    @SerializedName("np")
    val np: List<Int?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}