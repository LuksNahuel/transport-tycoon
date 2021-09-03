class Truck {
    private var currentLocation = Factory()
    private var timeTraveled = Time.of(0)
    private var cargo: Container? = null

    fun currentLocation() = currentLocation

    fun deliver(container: Container) {
        val destination = container.destination
        timeTraveled = Route().timeToTravel(from = currentLocation, to = destination)
    }

    fun timeTraveled(): Time {
        return timeTraveled
    }

    fun cargo(): Container? {
        return cargo
    }

    fun pickFrom(factory: Factory) {
        cargo = factory.firstContainer()
    }
}
