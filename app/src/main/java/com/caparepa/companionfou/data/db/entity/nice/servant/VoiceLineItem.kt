package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "voice_line_item"
)
data class VoiceLineItem(
    @SerializedName("name")
    val name: String?,
    @SerializedName("condType")
    val condType: String?,
    @SerializedName("condValue")
    val condValue: Int?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("svtVoiceType")
    val svtVoiceType: String?,
    @SerializedName("overwriteName")
    val overwriteName: String?,
    @SerializedName("id")
    val id: List<String?>?,
    @SerializedName("delay")
    val delay: List<Int?>?,
    @SerializedName("face")
    val face: List<Int?>?,
    @SerializedName("form")
    val form: List<Int?>?,
    @SerializedName("text")
    val text: List<String?>?,
    @SerializedName("subtitle")
    val subtitle: String?,
    @SerializedName("conds")
    val conds: List<VoiceLineCondItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}