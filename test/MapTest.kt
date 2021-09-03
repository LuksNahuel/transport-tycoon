import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MapTest {
    @Test
    fun `duration between two locations`() {
        map.createRoute(Route(from = Locations.Factory, to = Locations.WarehouseB, duration = Time.of(5)))

        val duration = map.duration(Locations.Factory, Locations.WarehouseB)

        assertThat(duration).isEqualTo(Time.of(5))
    }

    private val map = Map()
}
