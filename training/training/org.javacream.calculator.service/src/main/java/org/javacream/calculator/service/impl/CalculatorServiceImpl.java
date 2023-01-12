package org.javacream.calculator.service.impl;

import org.javacream.calculator.service.api.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double plus(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double minus(double n1, double n2) {
        return n1 - n2;
    }
}
