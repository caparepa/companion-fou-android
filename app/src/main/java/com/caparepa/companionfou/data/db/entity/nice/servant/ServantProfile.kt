package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "servant_profile"
)
data class ServantProfile(
    @SerializedName("cv")
    val cv: String?,
    @SerializedName("illustrator")
    val illustrator: String?,
    @Embedded
    @SerializedName("stats")
    val stats: ServantStats?,
    @Embedded
    @SerializedName("costume")
    val costume: Map<Int, ProfileCostumeItem?>?,
    @Embedded
    @SerializedName("comments")
    val comments: List<CommentItem?>?,
    @Embedded
    @SerializedName("voices")
    val voices: List<VoiceItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nProfileId: Long = 0
}