package com.caparepa.companionfou.data.model.common.nice.card

data class FaceCardConfiguration(
    val arts: ColorCard? = null,
    val buster: ColorCard? = null,
    val quick: ColorCard? = null,
    val extra: ExtraCard? = null,
    val blank: BlankCard? = null,
    val weak: WeakCard? = null,
    val strength: StrengthCard? = null
)