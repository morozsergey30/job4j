package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (finish % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            prime = true;
        }
        return prime;
    }
}
