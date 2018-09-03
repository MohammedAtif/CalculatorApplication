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

        CalculationIntResult result = new CalculationIntResult();
        List<Integer> inputs = new ArrayList<>();
        inputs.add(input);

        result.setInput(inputs);



        int fact=1, i=1;

        if(input==0){
            fact=1;
        }
        else{
            while(i<=input){
                fact*=i;
            }
        }

        result.setResult(fact);

        return result;
    }
}
