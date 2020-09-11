package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "buff_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class BuffItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("icon")
    val icon: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("buffGroup")
    val buffGroup: Int?,
    @Embedded(prefix = "vals_")
    @SerializedName("vals")
    val vals: List<BuffValItem?>?,
    @Embedded(prefix = "tvals_")
    @SerializedName("tvals")
    val tvals: List<BuffValItem?>?,
    @Embedded
    @SerializedName("ckSelfIndv")
    val ckSelfIndv: List<CkSelfIndvItem?>?,
    @Embedded
    @SerializedName("ckOpIndv")
    val ckOpIndv: List<CkOpIndvItem?>?,
    @SerializedName("maxRate")
    val maxRate: Int?
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "buffItemId")
    var mId: Long = 0
}