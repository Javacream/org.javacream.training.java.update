package org.training.upgrade.language.default_methods;

public class CalculatorImpl implements Calculator{
    @Override
    public double plus(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double minus(double n1, double n2) {
        return n1 - n2;
    }
}
