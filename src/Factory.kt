class Factory {
    private val containers = mutableListOf<Container>()

    fun addContainer(container: Container) {
        containers.add(container)
    }

    fun containers(): List<Container> {
        return containers
    }

    fun firstContainer(): Container {
        return containers.removeAt(0)
    }
}
