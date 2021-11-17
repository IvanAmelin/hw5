package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'Границы перепутаны', 1000, 100, 0",
            "'Максимальная граница слишком большая', 100, 500000000000, 90",
            "'Минимальная граница слишком большая', 0, 5000, 61",})
    void TestforSQRService(String testName, long minBoard, long maxBoard, long expected) {
        SQRService SQRServiceFirst = new SQRService();

        long actual = SQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

}