package io.kamara.fenples

enum class PriceLevel(val value: Int) {
    FREE(0),
    INEXPENSIVE(1),
    MODERATE(2),
    EXPENSIVE(3),
    VERY_EXPENSIVE(4),
}

fun Int.toPriceLevel(): PriceLevel {
    return when(this) {
        0 -> PriceLevel.FREE
        1 -> PriceLevel.INEXPENSIVE
        2 -> PriceLevel.MODERATE
        3 -> PriceLevel.EXPENSIVE
        4 -> PriceLevel.VERY_EXPENSIVE
        else -> {
            throw IllegalStateException(" Invalid value $this")
        }
    }
}
