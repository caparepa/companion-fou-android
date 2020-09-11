package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.BaseMaterialItem
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "materials"
)
data class Materials(
    @Embedded
    @SerializedName("items")
    val items: List<BaseMaterialItem?>?,
    @SerializedName("qp")
    val qp: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var nMaterialId: Long = 0
}