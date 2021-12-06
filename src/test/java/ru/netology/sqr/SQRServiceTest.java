package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void should0WhenSwappedRangeBoundaries() {
        long minBoard = 1000;
        long maxBoard = 100;
        long expected = 0;

        SQRService sQRServiceFirst = new SQRService();

        long actual = sQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void should90WhenTheUpperLimitIsVeryHigh() {
        long minBoard = 100;
        long maxBoard = 500000000;
        long expected = 90;
        SQRService sQRServiceFirst = new SQRService();

        long actual = sQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void should61WhenLowerLimitIs0() {
        long minBoard = 0;
        long maxBoard = 5000;
        long expected = 61;
        SQRService sQRServiceFirst = new SQRService();

        long actual = sQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

}