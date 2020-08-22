package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName

data class CommandCodeItem(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("collectionNo")
    val collectionNo: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets? = null,
    @SerializedName("skills")
    val skills: List<Skill?>? = null,
    @SerializedName("comment")
    val comment: String? = null
)