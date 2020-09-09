package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.BaseMaterialItem
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "skill_materials_item"
)
data class SkillMaterials(
    @SerializedName("items")
    val items: List<BaseMaterialItem?>? = null,
    @SerializedName("qp")
    val qp: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mId: Long = 0
}