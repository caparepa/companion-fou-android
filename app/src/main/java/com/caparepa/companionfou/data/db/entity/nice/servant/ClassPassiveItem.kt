package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "class_passive_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class ClassPassiveItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("icon")
    val icon: String?,
    @SerializedName("coolDown")
    val coolDown: List<Int?>?,
    @SerializedName("actIndividuality")
    val actIndividuality: List<IndividualityItem?>?,
    @Embedded
    @SerializedName("script")
    val script: Script?,
    @SerializedName("functions")
    val functions: List<FunctionItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nPassiveId: Long = 0
}