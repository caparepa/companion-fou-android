package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "ck_self_indv",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class CkSelfIndvItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}