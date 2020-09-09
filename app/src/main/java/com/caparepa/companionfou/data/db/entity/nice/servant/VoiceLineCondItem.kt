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
    val condType: String? = null,
    @SerializedName("value")
    val value: Int? = null,
    @SerializedName("valueList")
    val valueList: List<Int?>? = null,
    @SerializedName("eventId")
    val eventId: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}