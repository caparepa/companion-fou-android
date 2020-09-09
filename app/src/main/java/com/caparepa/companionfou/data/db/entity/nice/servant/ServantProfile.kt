package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "servant_profile"
)
data class ServantProfile(
    @SerializedName("cv")
    val cv: String? = null,
    @SerializedName("illustrator")
    val illustrator: String? = null,
    @SerializedName("stats")
    val stats: ServantStats? = null,
    @Embedded
    @SerializedName("costume")
    val costume: Map<Int, ProfileCostumeItem?>? = null,
    @Embedded
    @SerializedName("comments")
    val comments: List<CommentItem?>? = null,
    @Embedded
    @SerializedName("voices")
    val voices: List<VoiceItem?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}