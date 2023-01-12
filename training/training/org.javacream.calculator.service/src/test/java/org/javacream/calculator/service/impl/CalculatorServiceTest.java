package org.javacream.calculator.service.impl;

import org.javacream.calculator.service.api.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
private CalculatorService calculatorService;

@BeforeEach public void setUp(){
    calculatorService = new CalculatorServiceImpl();
}
@Test public void testPlus(){
    double n1 = 20;
    double n2 = 22;
    double expected = 42;
    double result = calculatorService.plus(n1, n2);
    Assertions.assertEquals(expected, result);
}
    @Test public void testMinus(){
        double n1 = 20;
        double n2 = 22;
        double expected = -2;
        double result = calculatorService.minus(n1, n2);
        Assertions.assertEquals(expected, result);
    }
}
