package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "voiceline_cond_item"
)
data class VoiceLineCondItem(
    @SerializedName("condType")
    val condType: String?,
    @SerializedName("value")
    val value: Int?,
    @Embedded
    @SerializedName("valueList")
    val valueList: List<Int?>?,
    @SerializedName("eventId")
    val eventId: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var nCondId: Long = 0
}