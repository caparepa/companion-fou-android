package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "profile_costume_item",
    indices = [
        Index(value = ["id"], unique = true),
        Index(value = ["costumeCollectionNo"], unique = true)
    ]
)
data class ProfileCostumeItem(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("costumeCollectionNo")
    val costumeCollectionNo: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("shortName")
    val shortName: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("priority")
    val priority: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}