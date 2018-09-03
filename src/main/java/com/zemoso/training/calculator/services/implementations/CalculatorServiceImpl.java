package com.zemoso.training.calculator.services.implementations;

import com.zemoso.training.calculator.datasource.CalculationIntResult;
import com.zemoso.training.calculator.services.interfaces.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public CalculationIntResult getSum(int a, int b){
        List<Integer> inputs = new ArrayList<>();
        inputs.add(a);
        inputs.add(b);
        int sum = a + b;
        CalculationIntResult result = new CalculationIntResult();
        result.setInput(inputs);
        result.setResult(sum);
        return result;
    }

    @Override
    public CalculationIntResult getFactorial(int input) {
        int solution = 1;
        if(input == 0){
            solution = 1;

        }else if(input > 0){
           int count = input;
           while (count > 0){
               solution = solution*count;
               count--;
           }
        }else{
            return null;
        }
        CalculationIntResult result = new CalculationIntResult();
        result.setResult(solution);
        return result;
    }
}
