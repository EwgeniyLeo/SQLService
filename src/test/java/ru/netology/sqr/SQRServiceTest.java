package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void testSql() {
        SQLService sql = new SQLService();

        int minBorder = 200;
        int maxBorder = 300;
        int expected = 3;

        int result = sql.square(minBorder, maxBorder);
        assertEquals(expected, result);
    }


}