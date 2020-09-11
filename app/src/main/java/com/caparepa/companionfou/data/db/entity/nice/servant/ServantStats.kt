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
    val strength: String?,
    @SerializedName("endurance")
    val endurance: String?,
    @SerializedName("agility")
    val agility: String?,
    @SerializedName("magic")
    val magic: String?,
    @SerializedName("luck")
    val luck: String?,
    @SerializedName("np")
    val np: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}