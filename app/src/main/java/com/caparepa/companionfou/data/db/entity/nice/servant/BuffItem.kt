package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "buff_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class BuffItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("buffGroup")
    val buffGroup: Int? = null,
    @Embedded(prefix = "vals_")
    @SerializedName("vals")
    val vals: List<BuffValItem?>? = null,
    @Embedded(prefix = "tvals_")
    @SerializedName("tvals")
    val tvals: List<BuffValItem?>? = null,
    @Embedded
    @SerializedName("ckSelfIndv")
    val ckSelfIndv: List<CkSelfIndvItem?>? = null,
    @Embedded
    @SerializedName("ckOpIndv")
    val ckOpIndv: List<CkOpIndvItem?>? = null,
    @SerializedName("maxRate")
    val maxRate: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}