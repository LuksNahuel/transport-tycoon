class Point(val location: Int) {
    companion object {
        fun at(location: Int): Point {
            return Point(location)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (location != other.location) return false

        return true
    }

    override fun hashCode(): Int {
        return location
    }

    operator fun minus(point: Point): Point {
        return Point(this.location - point.location)
    }

}
