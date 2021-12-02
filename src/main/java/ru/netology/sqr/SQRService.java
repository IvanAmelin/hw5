package ru.netology.sqr;

public class SQRService {
    public long calculate(long minboard, long maxboard) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= minboard) && (i * i <= maxboard)) {
                count = count + 1;
            }
        }
        return count;
    }
}