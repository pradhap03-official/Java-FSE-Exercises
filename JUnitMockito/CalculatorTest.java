import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, c.add(5,5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, c.subtract(5,3));
    }
}
