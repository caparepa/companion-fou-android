package com.caparepa.companionfou.data.model.nice.servant

import com.caparepa.companionfou.data.model.nice.common.FunctionItem
import com.caparepa.companionfou.data.model.nice.common.IndividualityItem
import com.caparepa.companionfou.data.model.nice.common.ScriptObj
import com.google.gson.annotations.SerializedName

data class ClassPassiveItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("coolDown")
    val coolDown: List<Int?>? = null,
    @SerializedName("actIndividuality")
    val actIndividuality: List<IndividualityItem?>? = null,
    @SerializedName("script")
    val script: ScriptObj? = null,
    @SerializedName("functions")
    val functions: List<FunctionItem?>? = null
)