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
    val id: Long?,
    @SerializedName("collectionNo")
    val collectionNo: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("rarity")
    val rarity: Int?,
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets?,
    @SerializedName("skills")
    val skills: List<SkillItem?>?,
    @SerializedName("comment")
    val comment: String?
) {
    @PrimaryKey(autoGenerate = true)
    var mCommandId: Long = 0
}