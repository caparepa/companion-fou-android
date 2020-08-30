package com.caparepa.companionfou.data.model.nice.commandcode


import com.caparepa.companionfou.data.model.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.model.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName

data class CommandCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets? = null,
    @SerializedName("skills")
    val skills: List<SkillItem?>? = null,
    @SerializedName("comment")
    val comment: String? = null
)