package com.caparepa.companionfou.data.db.entity.nice.commandcode

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.db.entity.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName
@Entity(
    tableName = "nice_command_code",
    indices = [
        Index(value = ["collectionNo"], unique = true)
    ]
)
data class CommandCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Long? = null,
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
) {
    @PrimaryKey(autoGenerate = true)
    var mCommandId: Long = 0
}