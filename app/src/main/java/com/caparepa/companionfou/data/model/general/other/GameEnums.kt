package com.caparepa.companionfou.data.model.general.other


import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class GameEnums(
    /**
     * JsonElement is Map<Int, String>
     */
    @SerializedName("NiceSvtType")
    val niceSvtType: JsonElement? = null,
    @SerializedName("NiceSvtFlag")
    val niceSvtFlag: JsonElement? = null,
    @SerializedName("NiceSkillType")
    val niceSkillType: JsonElement? = null,
    @SerializedName("NiceFuncType")
    val niceFuncType: JsonElement? = null,
    @SerializedName("FuncApplyTarget")
    val funcApplyTarget: JsonElement? = null,
    @SerializedName("NiceFuncTargetType")
    val niceFuncTargetType: JsonElement? = null,
    @SerializedName("NiceBuffType")
    val niceBuffType: JsonElement? = null,
    @SerializedName("NiceBuffAction")
    val niceBuffAction: JsonElement? = null,
    @SerializedName("NiceBuffLimit")
    val niceBuffLimit: JsonElement? = null,
    @SerializedName("NiceClassRelationOverwriteType")
    val niceClassRelationOverwriteType: JsonElement? = null,
    @SerializedName("NiceItemType")
    val niceItemType: JsonElement? = null,
    @SerializedName("NiceItemBGType")
    val niceItemBGType: JsonElement? = null,
    @SerializedName("NiceCardType")
    val niceCardType: JsonElement? = null,
    @SerializedName("Gender")
    val gender: JsonElement? = null,
    @SerializedName("Attribute")
    val attribute: JsonElement? = null,
    @SerializedName("SvtClass")
    val svtClass: JsonElement? = null,
    @SerializedName("NiceStatusRank")
    val niceStatusRank: JsonElement? = null,
    @SerializedName("NiceCondType")
    val niceCondType: JsonElement? = null,
    @SerializedName("NiceVoiceCondType")
    val niceVoiceCondType: JsonElement? = null,
    @SerializedName("NiceSvtVoiceType")
    val niceSvtVoiceType: JsonElement? = null,
    @SerializedName("NiceQuestType")
    val niceQuestType: JsonElement? = null,
    @SerializedName("NiceConsumeType")
    val niceConsumeType: JsonElement? = null,
    @SerializedName("Trait")
    val trait: JsonElement? = null
)