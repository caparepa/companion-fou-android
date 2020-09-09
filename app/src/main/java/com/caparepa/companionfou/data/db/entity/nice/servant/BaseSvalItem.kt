package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "base_svan_item"
)
data class BaseSvalItem(
    @SerializedName("Rate")
    val rate: Int? = null,
    @SerializedName("Turn")
    val turn: Int? = null,
    @SerializedName("Count")
    val count: Int? = null,
    @SerializedName("Value")
    val value: Int? = null,
    @SerializedName("Value2")
    val value2: Int? = null,
    @SerializedName("ShowState")
    val showState: Int? = null,
    @SerializedName("OnField")
    val onField: Int? = null,
    @SerializedName("UseRate")
    val useRate: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mBaseSvalId: Long = 0
}