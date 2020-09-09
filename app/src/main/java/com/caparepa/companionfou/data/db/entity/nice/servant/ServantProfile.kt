package com.caparepa.companionfou.data.db.entity.nice.servant

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
    val stats: ProfileStats? = null,
    @SerializedName("costume")
    val costume: Map<Int, ProfileCostumeItem?>? = null,
    @SerializedName("comments")
    val comments: List<ProfileCommentItem?>? = null,
    @SerializedName("voices")
    val voices: List<ServantVoiceItem?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}