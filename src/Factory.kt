class Factory: Location {
    private val containers = mutableListOf<Container>()

    fun addContainer(container: Container) {
        containers.add(container)
    }

    fun containers(): List<Container> {
        return containers
    }

    override fun location() = Point.at(0)

    fun firstContainer(): Container {
        return containers.removeAt(0)
    }
}
