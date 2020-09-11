package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "voiceline_cond_item"
)
data class VoiceLineCondItem(
    @SerializedName("condType")
    val condType: String?,
    @SerializedName("value")
    val value: Int?,
    @SerializedName("valueList")
    val valueList: List<Int?>?,
    @SerializedName("eventId")
    val eventId: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}