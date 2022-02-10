package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldsqrCalculateInMiddleOfRange() {
        SQRService service = new SQRService();

        int low = 1000;
        int limit = 2000;
        int expected = 13;


        int actual = service.sqrCalculate(low, limit);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldsqrCalculateTheEndOfRange() {
        SQRService service = new SQRService();

        int low = 9000;
        int limit = 9900;
        int expected = 5;


        int actual = service.sqrCalculate(low, limit);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldsqrCalculateTheBeginningOfRange() {
        SQRService service = new SQRService();

        int low = 100;
        int limit = 200;
        int expected = 5;


        int actual = service.sqrCalculate(low, limit);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldsqrCalculateOutOfRange1() {
        SQRService service = new SQRService();

        int low = 10;
        int limit = 99;
        int expected = 0;


        int actual = service.sqrCalculate(low, limit);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldsqrCalculateOutOfRange2() {
        SQRService service = new SQRService();

        int low = 9802;
        int limit = 10_000;
        int expected = 0;


        int actual = service.sqrCalculate(low, limit);

        assertEquals(expected, actual);
    }
}