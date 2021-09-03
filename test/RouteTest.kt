import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RouteTest {
    @Test
    fun `route from factory to B spend 5 hours to travel`() {
        val factory = Factory()
        val whereHouseB = WareHouseB()

        val timeToTravel = Route().timeToTravel(factory, whereHouseB)

        assertThat(timeToTravel).isEqualTo(Time.of(5))
    }
}
