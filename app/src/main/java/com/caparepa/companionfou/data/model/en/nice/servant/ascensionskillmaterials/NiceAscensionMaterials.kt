package com.caparepa.companionfou.data.model.en.nice.servant.ascensionskillmaterials


import com.google.gson.annotations.SerializedName

data class NiceAscensionMaterials(
    @SerializedName("1")
    val x1: NiceMaterialsByLevel? = null,
    @SerializedName("2")
    val x2: NiceMaterialsByLevel? = null,
    @SerializedName("3")
    val x3: NiceMaterialsByLevel? = null,
    @SerializedName("4")
    val x4: NiceMaterialsByLevel? = null,
    @SerializedName("5")
    val x5: NiceMaterialsByLevel? = null
)