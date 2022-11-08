package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
        SQLCalculate sql = new SQLCalculate();

        int minBorder = 200;
        int maxBorder = 300;
        int Count = sql.square(minBorder, maxBorder);

        System.out.println(Count);

    }
}
