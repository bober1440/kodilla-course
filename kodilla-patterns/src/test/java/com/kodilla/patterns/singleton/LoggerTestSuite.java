package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testLastLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("1");
        logger.log("2");
        logger.log("3");
        logger.log("4");
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("4", lastLog);
    }
}
