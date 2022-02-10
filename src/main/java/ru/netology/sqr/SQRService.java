package ru.netology.sqr;

public class SQRService {

    public int sqrCalculate(int low, int limit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= low && i * i <= limit) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}