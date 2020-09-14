package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.general.facecards.FaceCardParams
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "face_card"
)
data class FaceCardEntity(
    @ColumnInfo(name = "arts")
    val arts: String? = null,
    @ColumnInfo(name = "buster")
    val buster: String? = null,
    @ColumnInfo(name = "quick")
    val quick: String? = null,
    @ColumnInfo(name = "extra")
    val extra: String? = null,
    @ColumnInfo(name = "blank")
    val blank: String? = null,
    @ColumnInfo(name = "weak")
    val weak: String? = null,
    @ColumnInfo(name = "strength")
    val strength: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

    fun String.getFaceCard(): Map<Int, FaceCardParams>? {
        return this.toKotlinObject()
    }
}