package com.caparepa.companionfou.data.model.nice.commandcode

import com.caparepa.companionfou.data.model.common.ExtraAssets
import com.caparepa.companionfou.data.model.common.SkillItem
import com.google.gson.JsonArray

import com.google.gson.annotations.SerializedName

data class CommandCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    /** ExtraAssets? **/
    @SerializedName("extraAssets")
    val extraAssets: String? = null,
    /** List<SkillItem?>? **/
    @SerializedName("skills")
    val skills: JsonArray? = null,
    @SerializedName("comment")
    val comment: String? = null
)