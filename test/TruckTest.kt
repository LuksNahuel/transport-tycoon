import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TruckTest {
    @Test
    fun `truck starts at factory`() {
        val truck = Truck()

        assertThat(truck.currentLocation()).isEqualTo(Locations.Factory)
    }

    @Test
    fun `deliver a cargo to A spends 5 hours traveling`() {
        val truck = Truck()
        val container = Container(destination = Locations.B)

        truck.deliver(container)

        assertThat(truck.timeTraveled()).isEqualTo(Time.of(5))
    }
}
