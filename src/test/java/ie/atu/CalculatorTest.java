package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void addTest() {
        calculator = new Calculator();
        assertEquals(20, calculator.add(5, 15));
    }
}
