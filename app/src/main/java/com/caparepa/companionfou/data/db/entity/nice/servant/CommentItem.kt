package com.caparepa.companionfou.data.db.entity.nice.servant

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
    val id: Int? = null,
    @SerializedName("priority")
    val priority: Int? = null,
    @SerializedName("condMessage")
    val condMessage: String? = null,
    @SerializedName("comment")
    val comment: String? = null,
    @SerializedName("condType")
    val condType: String? = null,
    @SerializedName("condValues")
    val condValues: List<Int?>? = null,
    @SerializedName("condValue2")
    val condValue2: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}