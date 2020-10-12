package com.caparepa.companionfou.data.model.other


import com.caparepa.companionfou.utils.getFormattedDateTime
import com.google.gson.annotations.SerializedName

data class LatestApiInfo(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("hash_na")
    val hashNa: String? = null,
    @SerializedName("timestamp_na")
    val timestampNa: Int? = null,
    @SerializedName("hash_jp")
    val hashJp: String? = null,
    @SerializedName("timestamp_jp")
    val timestampJp: Int? = null,
    @SerializedName("current_date")
    val currentDate: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: Any? = null
) {
    fun getFormattedCurrentDate(): String {
        return this.currentDate!!.getFormattedDateTime()
    }
}