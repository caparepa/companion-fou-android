package com.caparepa.companionfou.data.db.entity.general

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.caparepa.companionfou.data.model.general.attribute.RelationDetail
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "attribute_relation"
)
data class AttributeRelationEntity(
    @ColumnInfo(name = "server")
    val server: String? = null,
    /** RelationDetail **/
    @ColumnInfo(name = "human")
    val human: String? = null,
    @ColumnInfo(name = "sky")
    val sky: String? = null,
    @ColumnInfo(name = "earth")
    val earth: String? = null,
    @ColumnInfo(name = "star")
    val star: String? = null,
    @ColumnInfo(name = "beast")
    val beast: String? = null
) {
    @ColumnInfo(name = "table_id")
    @PrimaryKey(autoGenerate = true)
    var table_id: Long = 0

    fun String.getRelationDetail(): RelationDetail {
        return this.toKotlinObject()
    }
}