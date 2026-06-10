package de.schulung.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void addCorrect() {
        int a = 3, b = 5;
        int expected = 8;

        int result = calculator.add(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divideCorrect() {
        int a = 10, b = 5;
        int expected = 2;

        int result  = calculator.div(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divideByZero() {
        int a = 10, b = 0;

        assertThrows(ArithmeticException.class, () -> calculator.div(a, b));
    }
}
