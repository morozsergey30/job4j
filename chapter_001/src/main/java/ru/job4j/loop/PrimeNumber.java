package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 1;

        for (int i = 3; i <= finish; i++) {
            boolean rsl = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    rsl = false;
                    break;
                }
            }
            if (rsl == true) {
                count++;
            }
        }
        return count;
    }
}
