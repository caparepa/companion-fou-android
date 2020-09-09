package com.caparepa.companionfou.data.db.entity.nice.servant

import com.caparepa.companionfou.data.db.entity.nice.servant.ServantVoiceCond
import com.google.gson.annotations.SerializedName

data class ServantVoiceLine(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("condType")
    val condType: String? = null,
    @SerializedName("condValue")
    val condValue: Int? = null,
    @SerializedName("priority")
    val priority: Int? = null,
    @SerializedName("svtVoiceType")
    val svtVoiceType: String? = null,
    @SerializedName("overwriteName")
    val overwriteName: String? = null,
    @SerializedName("id")
    val id: List<String?>? = null,
    @SerializedName("delay")
    val delay: List<Int?>? = null,
    @SerializedName("face")
    val face: List<Int?>? = null,
    @SerializedName("form")
    val form: List<Int?>? = null,
    @SerializedName("text")
    val text: List<String?>? = null,
    @SerializedName("subtitle")
    val subtitle: String? = null,
    @SerializedName("conds")
    val conds: List<ServantVoiceCond?>? = null
)