package org.javacream.calculator.service.api;

import org.javacream.calculator.service.impl.CalculatorServiceImpl;

public class Context {
    private static CalculatorService calculatorService = new CalculatorServiceImpl();
    public static CalculatorService calculatorService(){
        return calculatorService;
    }
}
