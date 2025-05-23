import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        FactorialCalculator calculator = new FactorialCalculator();
        int result = calculator.calculate(0);
        assertEquals(1, result, "O fatorial de 0 deve ser 1");
    }
}
