package fr.efrei.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(42, calculator.multiply(6, 7));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(12, 0));
    }
}
