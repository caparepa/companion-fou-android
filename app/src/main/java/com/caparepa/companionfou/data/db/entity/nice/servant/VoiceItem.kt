package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "voice_item"
)
data class VoiceItem(
    @SerializedName("type")
    val type: String?,
    @SerializedName("voiceLines")
    val voiceLines: List<VoiceLineItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}