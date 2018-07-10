package com.zemoso.training.calculator.controller;

import com.zemoso.training.calculator.datasource.CalculationIntResult;
import com.zemoso.training.calculator.services.interfaces.CalculatorService;
import com.zemoso.training.calculator.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = Constants.MAPPINGS.BASE_URL + Constants.MAPPINGS.CALCULATE)
public class CalculatorController {

    @Autowired private CalculatorService mCalculatorService;

    @GetMapping(path = Constants.MAPPINGS.ADD)
    public CalculationIntResult getSum(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b){
        return mCalculatorService.getSum(a, b);
    }

    @GetMapping(path = Constants.MAPPINGS.FACTORIAL)
    public CalculationIntResult getFactorial(@RequestParam(value = "input") int input) {
        return mCalculatorService.getFactorial(input);
    }

}
