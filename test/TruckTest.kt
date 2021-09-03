import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TruckTest {
    @Test
    fun `truck starts at factory`() {
        val truck = Truck()
        val factory = Factory()

        assertThat(truck.currentLocation()).isEqualTo(factory)
    }

    @Test
    fun `truck pick the first container of the factory`() {
        val truck = Truck()
        val factory = Factory()
        val destination = WareHouseB()
        val container = Container(destination = destination)
        factory.addContainer(container)

        truck.pickFrom(factory)

        assertThat(truck.cargo()).isEqualTo(container)
    }

//    @Test
//    fun `deliver a cargo to B spends 5 hours traveling`() {
//        val truck = Truck()
//        val container = Container(destination = Locations.B)
//
//        truck.deliver(container)
//
//        assertThat(truck.timeTraveled()).isEqualTo(Time.of(5))
//    }
}
