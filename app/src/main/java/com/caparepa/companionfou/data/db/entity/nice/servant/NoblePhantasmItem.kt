package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "noble_phantasm_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class NoblePhantasmItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("num")
    val num: Int? = null,
    @SerializedName("card")
    val card: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("rank")
    val rank: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("npGain")
    val npGain: NpGain? = null,
    @SerializedName("npDistribution")
    val npDistribution: List<Int?>? = null,
    @SerializedName("strengthStatus")
    val strengthStatus: Int? = null,
    @SerializedName("priority")
    val priority: Int? = null,
    @SerializedName("condQuestId")
    val condQuestId: Int? = null,
    @SerializedName("condQuestPhase")
    val condQuestPhase: Int? = null,
    @SerializedName("individuality")
    val individuality: List<IndividualityItem?>? = null,
    @Embedded
    @SerializedName("functions")
    val functions: List<FunctionItem?>? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}