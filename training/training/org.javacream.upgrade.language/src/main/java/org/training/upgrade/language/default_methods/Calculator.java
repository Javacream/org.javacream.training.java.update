package org.training.upgrade.language.default_methods;

public interface Calculator {
    double plus(double n1, double n2);
    double minus(double n1, double n2);
    private double multiply(double n, int multiplicator){
        double result = 0;
        for (int i = 0; i < multiplicator; i++){
            //result += n;
            result = this.plus(result, n);
        }
        return result;

    }
}
