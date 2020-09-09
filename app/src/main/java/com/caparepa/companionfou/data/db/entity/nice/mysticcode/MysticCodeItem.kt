package com.caparepa.companionfou.data.db.entity.nice.mysticcode

import com.caparepa.companionfou.data.db.entity.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.db.entity.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName

data class MysticCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("detail")
    val detail: String? = null,
    @SerializedName("maxLv")
    val maxLv: Int? = null,
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets? = null,
    @SerializedName("skills")
    val skills: List<SkillItem?>? = null,
    @SerializedName("expRequired")
    val expRequired: List<Int?>? = null
)
