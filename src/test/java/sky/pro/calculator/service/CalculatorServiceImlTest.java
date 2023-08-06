package sky.pro.calculator.service;

import org.junit.jupiter.api.Test;
import sky.pro.calculator.exception.ZeroDivideException;

import static org.junit.jupiter.api.Assertions.*;
import static sky.pro.calculator.service.CalculatorTestConstants.*;

class CalculatorServiceImlTest {
    private final CalculatorServiceIml service = new CalculatorServiceIml();
    @Test
    void sum() {
        assertEquals(ONE + TWO, service.sum(ONE, TWO));
        assertEquals(THREE + TWO, service.sum(THREE, TWO));
    }

    @Test
    void minus() {
        assertEquals(TWO - ONE, service.minus(TWO, ONE));
        assertEquals(THREE - ONE, service.minus(THREE, ONE));
    }

    @Test
    void multiply() {
        assertEquals(ONE * TWO, service.multiply(ONE, TWO));
        assertEquals(THREE * TWO, service.multiply(THREE, TWO));
    }

    @Test
    void divide() {
        assertEquals(THREE / ONE , service.divide(THREE, ONE));
        assertEquals(TWO / ONE, service.divide(TWO, ONE));
    }

    @Test
    void shouldThrowZeroDivideException() {
        assertThrows(ZeroDivideException.class, () -> service.divide(TWO, ZERO));
    }
}