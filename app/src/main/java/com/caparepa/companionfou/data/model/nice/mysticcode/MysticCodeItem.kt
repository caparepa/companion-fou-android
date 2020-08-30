package com.caparepa.companionfou.data.model.nice.mysticcode


import com.caparepa.companionfou.data.model.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.model.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import io.objectbox.annotation.Unique

@Entity
data class MysticCodeItem(
    @Id var _id: Long = 0,
    @Unique
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
