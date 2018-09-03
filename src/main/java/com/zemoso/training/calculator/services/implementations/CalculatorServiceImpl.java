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
        Integer ans = 1;
        CalculationIntResult result = new CalculationIntResult();
        if(input <= 0) {
            result.setResult(ans);
        }
        else{
            for(int i=1; i < input + 1; i++){
                ans *=  i;
            }
            result.setResult(ans);
        }

        return result;
    }
}
