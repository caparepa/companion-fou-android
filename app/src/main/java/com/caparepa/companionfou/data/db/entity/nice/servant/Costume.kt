package com.caparepa.companionfou.data.db.entity.nice.servant


import com.google.gson.annotations.SerializedName

data class Costume(
    @SerializedName("costume")
    val costume: Map<Int, ServantCostumeItem?>? = null
) {
    data class ServantCostumeItem(
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("costumeCollectionNo")
        val costumecollectionNo: Long? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("shortName")
        val shortName: String? = null,
        @SerializedName("detail")
        val detail: String? = null,
        @SerializedName("priority")
        val priority: Int? = null
    )
}