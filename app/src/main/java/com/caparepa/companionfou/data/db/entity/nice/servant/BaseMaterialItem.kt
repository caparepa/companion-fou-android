package com.caparepa.companionfou.data.db.entity.nice.servant

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.db.entity.nice.servant.BaseMaterialDetail
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "base_material_item"
)
data class BaseMaterialItem(
    @SerializedName("item")
    val item: BaseMaterialDetail? = null,
    @SerializedName("amount")
    val amount: Int? = null
) {
    @PrimaryKey(autoGenerate = true)
    var mMaterialItemId: Long = 0
}