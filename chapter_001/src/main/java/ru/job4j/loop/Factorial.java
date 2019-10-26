package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (int num = 1; num <= n; num++) {
            result = result * num;
        }
        return result;
    }
}