package com.caparepa.companionfou.data.db.entity.nice.mysticcode

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.ExtraAssets
import com.caparepa.companionfou.data.db.entity.nice.servant.SkillItem
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "nice_mystic_code",
    indices = [
        Index(value = ["id"], unique = true)
    ]
)
data class MysticCodeItem(
    @SerializedName("id")
    val id: Long?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("detail")
    val detail: String?,
    @SerializedName("maxLv")
    val maxLv: Int?,
    @SerializedName("extraAssets")
    val extraAssets: ExtraAssets?,
    @SerializedName("skills")
    val skills: List<SkillItem?>?,
    @SerializedName("expRequired")
    val expRequired: List<Int?>?
) {
    @PrimaryKey(autoGenerate = true)
    var mCodeId: Long = 0
}
