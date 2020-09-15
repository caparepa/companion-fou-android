package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "game_enums"
)
data class GameEnumsEntity(
    /**
     * JsonElement is Map<Int, String>
     */
    @ColumnInfo(name ="nice_svt_type")
    val niceSvtType: String? = null,
    @ColumnInfo(name ="nice_svt_flag")
    val niceSvtFlag: String? = null,
    @ColumnInfo(name ="nice_skill_type")
    val niceSkillType: String? = null,
    @ColumnInfo(name ="nice_func_type")
    val niceFuncType: String? = null,
    @ColumnInfo(name ="func_apply_target")
    val funcApplyTarget: String? = null,
    @ColumnInfo(name ="nice_func_target_type")
    val niceFuncTargetType: String? = null,
    @ColumnInfo(name ="nice_buff_type")
    val niceBuffType: String? = null,
    @ColumnInfo(name ="nice_buff_action")
    val niceBuffAction: String? = null,
    @ColumnInfo(name ="nice_buff_limit")
    val niceBuffLimit: String? = null,
    @ColumnInfo(name ="nice_class_relation_overwrite_type")
    val niceClassRelationOverwriteType: String? = null,
    @ColumnInfo(name ="nice_item_type")
    val niceItemType: String? = null,
    @ColumnInfo(name ="nice_item_b_g_type")
    val niceItemBGType: String? = null,
    @ColumnInfo(name ="nice_card_type")
    val niceCardType: String? = null,
    @ColumnInfo(name ="gender")
    val gender: String? = null,
    @ColumnInfo(name ="attribute")
    val attribute: String? = null,
    @ColumnInfo(name ="svt_class")
    val svtClass: String? = null,
    @ColumnInfo(name ="nice_status_rank")
    val niceStatusRank: String? = null,
    @ColumnInfo(name ="nice_cond_type")
    val niceCondType: String? = null,
    @ColumnInfo(name ="nice_voice_cond_type")
    val niceVoiceCondType: String? = null,
    @ColumnInfo(name ="nice_svt_voice_type")
    val niceSvtVoiceType: String? = null,
    @ColumnInfo(name ="nice_quest_type")
    val niceQuestType: String? = null,
    @ColumnInfo(name ="nice_consume_type")
    val niceConsumeType: String? = null,
    @ColumnInfo(name ="trait")
    val trait: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Long = 0
}