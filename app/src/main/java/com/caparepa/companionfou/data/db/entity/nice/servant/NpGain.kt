package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "np_gain"
)
data class NpGain(
    @SerializedName("buster")
    val buster: List<Int?>?,
    @SerializedName("arts")
    val arts: List<Int?>?,
    @SerializedName("quick")
    val quick: List<Int?>?,
    @SerializedName("extra")
    val extra: List<Int?>?,
    @SerializedName("defence")
    val defence: List<Int?>?,
    @SerializedName("np")
    val np: List<Int?>?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}