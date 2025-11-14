package com.smartbuild;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.add(5, 7));
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(5, 2));
    }
}
