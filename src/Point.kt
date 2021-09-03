class Point(val point: Int) {
    companion object {
        fun at(location: Int): Point {
            return Point(location)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (point != other.point) return false

        return true
    }

    override fun hashCode(): Int {
        return point
    }

    operator fun minus(point: Point): Point {
        return Point(this.point - point.point)
    }
}
