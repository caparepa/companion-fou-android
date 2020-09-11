package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.*
import com.caparepa.companionfou.data.db.entity.nice.servant.FunctionItem
import com.caparepa.companionfou.data.db.entity.nice.servant.IndividualityItem
import com.caparepa.companionfou.data.db.entity.nice.servant.Script
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "skill_item",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class SkillItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("num")
    val num: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("strengthStatus")
    val strengthStatus: Int?,
    @SerializedName("priority")
    val priority: Int?,
    @SerializedName("condQuestId")
    val condQuestId: Int?,
    @SerializedName("condQuestPhase")
    val condQuestPhase: Int?,
    @SerializedName("icon")
    val icon: String?,
    @SerializedName("coolDown")
    val coolDown: List<Int?>?,
    @SerializedName("actIndividuality")
    val actIndividuality: List<IndividualityItem?>?,
    @Embedded
    @SerializedName("script")
    val script: Script?,
    @SerializedName("functions")
    val functions: List<FunctionItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nSkillId: Long = 0
}