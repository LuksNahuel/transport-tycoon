import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WareHouseBTest {
    @Test
    fun `where house B knows his location`() {
        val whereHouseB = WareHouseB()

        assertThat(whereHouseB.location()).isEqualTo(Point.at(5))
    }
}