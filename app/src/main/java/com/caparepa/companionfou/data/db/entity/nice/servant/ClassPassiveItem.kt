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
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @Embedded
    @SerializedName("coolDown")
    val coolDown: List<Int?>? = null,
    @Embedded(prefix = "class_passive_individuality")
    @SerializedName("actIndividuality")
    val actIndividuality: List<IndividualityItem?>? = null,
    @Embedded
    @SerializedName("script")
    val script: Script? = null,
    @Embedded(prefix = "class_passive_function_")
    @SerializedName("functions")
    val functions: List<FunctionItem?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}