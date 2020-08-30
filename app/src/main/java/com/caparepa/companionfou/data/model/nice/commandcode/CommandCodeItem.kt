package com.caparepa.companionfou.data.model.nice.commandcode

import io.objectbox.annotation.Entity
import com.caparepa.companionfou.data.model.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.model.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Id
import io.objectbox.annotation.Unique

@Entity
data class CommandCodeItem(
    @Id var _id: Long = 0,
    @Unique
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