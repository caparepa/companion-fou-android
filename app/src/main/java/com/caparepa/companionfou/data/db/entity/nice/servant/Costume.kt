package com.caparepa.companionfou.data.db.entity.nice.servant


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "costume"
)
data class Costume(
    @Embedded
    @SerializedName("costume")
    val costume: Map<Int, CostumeItem?>?
) {
    @PrimaryKey(autoGenerate = true)
    var nCostumeId: Long = 0
}