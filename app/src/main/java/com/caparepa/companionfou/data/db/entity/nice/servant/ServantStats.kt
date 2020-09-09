package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "servant_stats"
)
data class ServantStats(
    @SerializedName("strength")
    val strength: String? = null,
    @SerializedName("endurance")
    val endurance: String? = null,
    @SerializedName("agility")
    val agility: String? = null,
    @SerializedName("magic")
    val magic: String? = null,
    @SerializedName("luck")
    val luck: String? = null,
    @SerializedName("np")
    val np: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}