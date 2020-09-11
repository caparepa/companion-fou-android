package com.caparepa.companionfou.data.db.entity.nice.servant


import com.google.gson.annotations.SerializedName

data class Costume(
    @SerializedName("costume")
    val costume: Map<Int, ServantCostumeItem?>?
) {
    data class ServantCostumeItem(
        @SerializedName("id")
        val id: Int?,
        @SerializedName("costumeCollectionNo")
        val costumecollectionNo: Long?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("shortName")
        val shortName: String?,
        @SerializedName("detail")
        val detail: String?,
        @SerializedName("priority")
        val priority: Int?
    )
}