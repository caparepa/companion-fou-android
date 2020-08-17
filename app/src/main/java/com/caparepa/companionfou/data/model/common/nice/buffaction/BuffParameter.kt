package com.caparepa.companionfou.data.model.common.nice.buffaction

data class BuffParameter(
    val limit: String? = null,
    val plusTypes: List<String>? = null,
    val minusTypes: List<String>? = null,
    val baseParam: Int? = null,
    val baseValue: Int? = null,
    val isRec: Boolean? = null,
    val plusAction: Int? = null,
    val maxRate: List<Int>? = null
)