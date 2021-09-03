class Map {
    private val routes = mutableListOf<Route>()

    fun duration(from: Locations, to: Locations): Time {
        return routes.first { it.from == from && it.to == to }.duration
    }

    fun createRoute(route: Route) {
        routes.add(route)
    }
}
