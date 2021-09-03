class Route {
    fun timeToTravel(from: Location, to: Location): Time {
        return Time.of((to.location() - from.location()).location)
    }
}
