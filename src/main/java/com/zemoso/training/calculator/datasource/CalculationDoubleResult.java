package com.zemoso.training.calculator.datasource;

import lombok.Data;

import java.util.List;

@Data
public class CalculationDoubleResult {

    private List<Double> input;
    private Double result;

}
