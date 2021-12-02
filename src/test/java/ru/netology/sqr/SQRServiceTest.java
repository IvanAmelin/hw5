package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Границы перепутаны', 1000, 100, 0"})
    void Should_0_When_Swappedrangeboundaries(String testName, long minBoard, long maxBoard, long expected) {
        SQRService sQRServiceFirst = new SQRService();

        long actual = sQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Максимальная граница слишком большая', 100, 500000000000, 90"})
    void Should_90_When_Theupperlimitisveryhigh(String testName, long minBoard, long maxBoard, long expected) {
        SQRService sQRServiceFirst = new SQRService();

        long actual = sQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Минимальная граница 0', 0, 5000, 61"})
    void Should_61_When_Lowerlimitis0(String testName, long minBoard, long maxBoard, long expected) {
        SQRService sQRServiceFirst = new SQRService();

        long actual = sQRServiceFirst.calculate(minBoard, maxBoard);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

}