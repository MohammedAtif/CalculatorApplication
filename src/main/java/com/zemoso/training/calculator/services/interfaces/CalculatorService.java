package com.zemoso.training.calculator.services.interfaces;

import com.zemoso.training.calculator.datasource.CalculationIntResult;

public interface CalculatorService {

    CalculationIntResult getSum(int a, int b);
    CalculationIntResult getFactorial(int input);

}
