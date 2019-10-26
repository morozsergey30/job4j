package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 1;
        CheckPrimeNumber check = new CheckPrimeNumber();
        for (int i = 3; i <= finish; i++) {
            if (check.check(i)) {
                count++;
            }
        }
        return count;
    }
}