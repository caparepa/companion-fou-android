package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "hits_distribution"
)
data class HitsDistribution(
    @SerializedName("arts")
    val arts: List<Int?>?,
    @SerializedName("buster")
    val buster: List<Int?>?,
    @SerializedName("quick")
    val quick: List<Int?>?,
    @SerializedName("extra")
    val extra: List<Int?>?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}