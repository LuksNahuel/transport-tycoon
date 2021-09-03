class Place {
    fun pointOf(location: Locations): Point {
        return when(location) {
            Locations.Factory -> Point(0)
            Locations.WarehouseB -> Point(5)
        }
    }
}
