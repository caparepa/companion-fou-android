package com.caparepa.companionfou.data.db.entity.basic

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "basic_command_code")
data class CommandCodeItem(
    @SerializedName("id")
    val id: Long? = null,
    @SerializedName("collectionNo")
    val collectionNo: Long? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("rarity")
    val rarity: Int? = null,
    @SerializedName("face")
    val face: String? = null
) {
    @PrimaryKey(autoGenerate = false)
    var mCommandId: Long = collectionNo!!.toLong()
}