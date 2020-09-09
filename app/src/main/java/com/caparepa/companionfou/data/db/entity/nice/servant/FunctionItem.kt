package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "function_item",
    indices = [
        Index(value = ["funcId"], unique = true)
    ]
)
data class FunctionItem(
    @SerializedName("funcId")
    val funcId: Long? = null,
    @SerializedName("funcType")
    val funcType: String? = null,
    @SerializedName("funcTargetType")
    val funcTargetType: String? = null,
    @SerializedName("funcTargetTeam")
    val funcTargetTeam: String? = null,
    @SerializedName("funcPopupText")
    val funcPopupText: String? = null,
    @SerializedName("funcPopupIcon")
    val funcPopupIcon: String? = null,
    @SerializedName("functvals")
    val functvals: List<BuffValItem?>? = null,
    @SerializedName("funcquestTvals")
    val funcquestTvals: List<BuffValItem?>? = null,
    @SerializedName("buffs")
    val buffs: List<BuffItem?>? = null,
    @Embedded(prefix = "svals_")
    @SerializedName("svals")
    val svals: List<BaseSvalItem?>? = null,
    @Embedded(prefix = "svals2_")
    @SerializedName("svals2")
    val svals2: List<BaseSvalItem?>? = null,
    @Embedded(prefix = "svals3_")
    @SerializedName("svals3")
    val svals3: List<BaseSvalItem?>? = null,
    @Embedded(prefix = "svals4_")
    @SerializedName("svals4")
    val svals4: List<BaseSvalItem?>? = null,
    @Embedded(prefix = "svals5_")
    @SerializedName("svals5")
    val svals5: List<BaseSvalItem?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}