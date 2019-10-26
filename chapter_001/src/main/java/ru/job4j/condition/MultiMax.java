package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int one = (first > second) ? first : second;
        int two = (one > third) ? one : third;
        return two;
    }
}