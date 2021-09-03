class Truck {
    private var currentLocation = Locations.Factory
    private var timeTraveled = Time.of(0)

    fun currentLocation() = currentLocation

    fun deliver(container: Container) {
        val destination = container.destination
        timeTraveled = Route().requiredTimeToTravel(from = currentLocation, to = destination)
    }

    fun timeTraveled(): Time {
        return timeTraveled
    }
}
