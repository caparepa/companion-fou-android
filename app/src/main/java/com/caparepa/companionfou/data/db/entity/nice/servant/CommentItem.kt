package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "comment_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class CommentItem(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("condMessage")
    val condMessage: String?,
    @SerializedName("comment")
    val comment: String?,
    @SerializedName("condType")
    val condType: String?,
    @Embedded
    @SerializedName("condValues")
    val condValues: List<Int?>?,
    @SerializedName("condValue2")
    val condValue2: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}