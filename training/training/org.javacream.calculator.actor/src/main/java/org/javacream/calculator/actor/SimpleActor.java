package org.javacream.calculator.actor;

import org.javacream.calculator.service.api.CalculatorService;
import org.javacream.calculator.service.api.Context;

public class SimpleActor {

    public static void main(String[] args) {
        CalculatorService calculatorService = Context.calculatorService();
        System.out.println(calculatorService.plus(47, 11));
        System.out.println(calculatorService.minus(47, 11));
    }
}
