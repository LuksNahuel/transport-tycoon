import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PointTest {
    @Test
    fun `minus`() {
        assertThat(Point(5) - Point(1)).isEqualTo(Point(4))
    }
}
