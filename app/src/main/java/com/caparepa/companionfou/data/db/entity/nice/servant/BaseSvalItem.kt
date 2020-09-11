package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "base_sval_item"
)
data class BaseSvalItem(
    @SerializedName("Rate")
    val rate: Int?,
    @SerializedName("Turn")
    val turn: Int?,
    @SerializedName("Count")
    val count: Int?,
    @SerializedName("Value")
    val value: Int?,
    @SerializedName("Value2")
    val value2: Int?,
    @SerializedName("ShowState")
    val showState: Int?,
    @SerializedName("OnField")
    val onField: Int?,
    @SerializedName("UseRate")
    val useRate: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var nSvalId: Long = 0
}