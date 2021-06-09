package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void makeLog(){
        logger = Logger.INSTANCE;
        logger.log("Test of logger");
    }

    @Test
    void testGetLastLog(){

        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Test of logger", lastLog);
    }


}
