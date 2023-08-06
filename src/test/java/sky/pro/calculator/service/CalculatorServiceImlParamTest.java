package sky.pro.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sky.pro.calculator.service.CalculatorTestConstants.*;

public class CalculatorServiceImlParamTest {
    private final CalculatorServiceIml service = new CalculatorServiceIml();

    @MethodSource("providePrograms")
    @ParameterizedTest
    void sum(int num1, int num2) {
        assertEquals(num1 + num2, service.sum(num1, num2));
    }

    @MethodSource("providePrograms")
    @ParameterizedTest
    void minus(int num1, int num2) {
        assertEquals(num1 - num2, service.minus(num1, num2));
    }

    @MethodSource("providePrograms")
    @ParameterizedTest
    void multiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @MethodSource("providePrograms")
    @ParameterizedTest
    void divide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    private static Stream<Arguments> providePrograms() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(THREE, TWO),
                Arguments.of(ONE, THREE),
                Arguments.of(TWO, TWO),
                Arguments.of(ONE, ONE)
        );
    }
}
