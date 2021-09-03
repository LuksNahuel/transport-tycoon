import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FactoryTest {
    @Test
    fun `a factory can add containers`() {
        val factory = Factory()
        val container1 = Container(destination = Locations.WarehouseB)
        val container2 = Container(destination = Locations.WarehouseB)

        factory.addContainer(container1)
        factory.addContainer(container2)

        assertThat(factory.containers()).isEqualTo(listOf(container1, container2))
    }
}
