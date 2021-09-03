class Container(val destination: Location) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Container

        if (destination != other.destination) return false

        return true
    }

    override fun hashCode(): Int {
        return destination.hashCode()
    }
}
