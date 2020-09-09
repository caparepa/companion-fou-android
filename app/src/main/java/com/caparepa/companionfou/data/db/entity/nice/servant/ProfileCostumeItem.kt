package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "servant_profile_costume",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class ProfileCostumeItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("costumeCollectionNo")
    val costumecollectionNo: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("shortName")
    val shortName: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("priority")
    val priority: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}