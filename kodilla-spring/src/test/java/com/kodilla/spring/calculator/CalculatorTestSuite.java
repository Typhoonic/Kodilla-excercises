package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculation(){

        //Given
        //When
        double addValue = calculator.add(2, 2);
        double subValue = calculator.sub(2, 2);
        double mulValue = calculator.mul(2, 2);
        double divValue = calculator.div(2, 2);
        //Then
        assertEquals(4, addValue);
        assertEquals(0, subValue);
        assertEquals(4, mulValue);
        assertEquals(1, divValue);

    }

}
