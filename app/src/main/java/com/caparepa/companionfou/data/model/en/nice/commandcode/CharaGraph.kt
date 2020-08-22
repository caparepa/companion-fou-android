package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName

data class CharaGraph(
    @SerializedName("cc")
    val cc: Map<Int,String?>? = null
)