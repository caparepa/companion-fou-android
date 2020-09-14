package com.caparepa.companionfou.data.db.dao.general

import com.caparepa.companionfou.data.model.general.attribute.RelationDetail
import com.caparepa.companionfou.utils.toKotlinObject
import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class AttributeRelationEntity(
    /** RelationDetail **/
    val human: String? = null,
    val sky: String? = null,
    val earth: String? = null,
    val star: String? = null,
    val beast: String? = null
) {
    fun String.getRelationDetail(): RelationDetail {
        return this.toKotlinObject()
    }
}