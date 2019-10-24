package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        if (finish == 2) {
            return 1;
        }
        if (finish > 3) {
            count = 2;
        }

        for (int i = 4; i <= finish; i++) {
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == (i / 2)) {
                    count++;
                }
            }
        }
        return count;
    }
}
