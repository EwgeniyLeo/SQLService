package ru.netology.sqr;

public class SQLService {
    public int square(int minBorder, int maxBorder) {
        int totalCount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minBorder && i * i <= maxBorder){
                totalCount++;
            }
        }
        return totalCount;
    }
}
