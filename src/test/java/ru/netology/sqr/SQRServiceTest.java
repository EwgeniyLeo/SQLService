package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void testSql() {
        SQLCalculate sql = new SQLCalculate();

        int minBorder = 200;
        int maxBorder = 300;
        int expected = 3;

        int result = sql.square(minBorder, maxBorder);
        assertEquals(expected, result);
    }


}