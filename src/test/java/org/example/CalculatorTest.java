package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(5.0, calc.divide(25, 5), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        calc.divide(10, 0);
    }
}
