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
    val funcId: Long?,
    @SerializedName("funcType")
    val funcType: String?,
    @SerializedName("funcTargetType")
    val funcTargetType: String?,
    @SerializedName("funcTargetTeam")
    val funcTargetTeam: String?,
    @SerializedName("funcPopupText")
    val funcPopupText: String?,
    @SerializedName("funcPopupIcon")
    val funcPopupIcon: String?,
    @Embedded(prefix = "funct_")
    @SerializedName("functvals")
    val functvals: List<BuffValItem?>?,
    @Embedded(prefix = "funcquest_")
    @SerializedName("funcquestTvals")
    val funcquestTvals: List<BuffValItem?>?,
    @Embedded
    @SerializedName("buffs")
    val buffs: List<BuffItem?>?,
    @Embedded(prefix = "svals_")
    @SerializedName("svals")
    val svals: List<BaseSvalItem?>?,
    @Embedded(prefix = "svals2_")
    @SerializedName("svals2")
    val svals2: List<BaseSvalItem?>?,
    @Embedded(prefix = "svals3_")
    @SerializedName("svals3")
    val svals3: List<BaseSvalItem?>?,
    @Embedded(prefix = "svals4_")
    @SerializedName("svals4")
    val svals4: List<BaseSvalItem?>?,
    @Embedded(prefix = "svals5_")
    @SerializedName("svals5")
    val svals5: List<BaseSvalItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nFunctionId: Long = 0
}