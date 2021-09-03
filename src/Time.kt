class Time(val amount: Int) {
    companion object {
        fun of(measure: Int): Time {
            return Time(measure)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Time

        if (amount != other.amount) return false

        return true
    }

    override fun hashCode(): Int {
        return amount
    }
}
