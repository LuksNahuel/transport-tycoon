class Truck(private val map: Map) {
    private var cargo: Container? = null
    private var currentLocation = Locations.Factory

    fun location() = currentLocation

    fun cargo(): Container? {
        return cargo
    }

    fun deliver() {
        TODO("Not yet implemented")
    }
}
