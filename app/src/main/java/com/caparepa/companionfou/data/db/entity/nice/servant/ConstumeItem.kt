package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "costume_item",
    indices = [
        Index(value = ["costumeCollectionNo"], unique = true)
    ]
)
data class CostumeItem(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("costumeCollectionNo")
    val costumecollectionNo: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("shortName")
    val shortName: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("priority")
    val priority: Int?
){
    @PrimaryKey(autoGenerate = true)
    var nCostumeItemId: Long = 0
}