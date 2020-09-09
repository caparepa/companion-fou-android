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
    val arts: List<Int?>? = null,
    @SerializedName("buster")
    val buster: List<Int?>? = null,
    @SerializedName("quick")
    val quick: List<Int?>? = null,
    @SerializedName("extra")
    val extra: List<Int?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}