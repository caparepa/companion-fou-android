package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "noble_phantasm",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class NoblePhantasmItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("num")
    val num: Int?,
    @SerializedName("card")
    val card: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("icon")
    val icon: String?,
    @SerializedName("rank")
    val rank: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("detail")
    val detail: String?,
    @Embedded(prefix = "np_gain")
    @SerializedName("npGain")
    val npGain: NpGain?,
    @Embedded(prefix = "np_dist_")
    @SerializedName("npDistribution")
    val npDistribution: List<Int?>?,
    @SerializedName("strengthStatus")
    val strengthStatus: Int?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("condQuestId")
    val condQuestId: Int?,
    @SerializedName("condQuestPhase")
    val condQuestPhase: Int?,
    @Embedded(prefix = "np_indv_")
    @SerializedName("individuality")
    val individuality: List<IndividualityItem?>?,
    @Embedded(prefix = "np_func_")
    @SerializedName("functions")
    val functions: List<FunctionItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nHouguId: Long = 0
}