package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "ck_op_indv_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class CkOpIndvItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ckOpId")
    var mId: Long = 0
}