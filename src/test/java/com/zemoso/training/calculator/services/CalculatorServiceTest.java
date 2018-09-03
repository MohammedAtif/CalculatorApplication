package com.zemoso.training.calculator.services;

import com.zemoso.training.calculator.CalculatorApplication;
import com.zemoso.training.calculator.services.interfaces.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CalculatorApplication.class, loader = AnnotationConfigContextLoader.class)
public class CalculatorServiceTest {

    @Autowired CalculatorService mCalculatorService;

    @Test
    public void testAddition(){
        Integer expectedResult = 10;
        assertEquals("Testing simple addition", expectedResult, mCalculatorService.getSum(2, 8).getResult());

        expectedResult = 10;
        assertNotEquals("Testing not equal result", expectedResult, mCalculatorService.getSum(-2, 8).getResult());
    }

    @Test
    public void testFactorial(){
        Integer expectedResult = 24;
        assertEquals("Testing factorial", expectedResult, mCalculatorService.getFactorial(4).getResult());

        Integer expectedResult = 120;
        assertEquals("Testing factorial", expectedResult, mCalculatorService.getFactorial(5).getResult());

        Integer expectedResult = 720;
        assertEquals("Testing factorial", expectedResult, mCalculatorService.getFactorial(6).getResult());
    }


}
