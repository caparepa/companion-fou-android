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
    @Embedded
    @SerializedName("npGain")
    val npGain: NpGain?,
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
    @SerializedName("individuality")
    val individuality: List<IndividualityItem?>?,
    @SerializedName("functions")
    val functions: List<FunctionItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nNoblePhantasmId: Long = 0
}