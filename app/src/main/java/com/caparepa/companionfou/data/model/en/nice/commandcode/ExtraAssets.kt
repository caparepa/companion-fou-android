package com.caparepa.companionfou.data.model.en.nice.commandcode

import com.google.gson.annotations.SerializedName

data class ExtraAssets(
    @SerializedName("charaGraph")
    val charaGraph: CharaGraph? = null,
    @SerializedName("faces")
    val faces: Faces? = null
)