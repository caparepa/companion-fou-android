package com.caparepa.companionfou.data.model.common

import com.google.gson.annotations.SerializedName

class ScriptObj(
    @SerializedName("SkillRankUp")
    val skillRankUp: Map<Int, List<Int>>? = null
)