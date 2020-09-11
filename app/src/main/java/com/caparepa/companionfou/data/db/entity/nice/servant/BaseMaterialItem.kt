package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.BaseMaterialDetail
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "material_item"
)
data class BaseMaterialItem(
    @SerializedName("item")
    val item: BaseMaterialDetail?,
    @SerializedName("amount")
    val amount: Int?
) {
    @PrimaryKey(autoGenerate = true)
    var nMaterialId: Long = 0
}