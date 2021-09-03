import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TruckTest {
    @Test
    fun `starts at factory`() {
        val truck = Truck(map)

        assertThat(truck.location()).isEqualTo(Locations.Factory)
    }

    @Test
    fun `picks the first container of the factory on deliver`() {
        factory.addContainer(Container(destination = Locations.WarehouseB))
        val truck = Truck(map)

        truck.deliver()

//        assertThat()
    }

    private val factory = Factory()
    private val map = Map()
}
