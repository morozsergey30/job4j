package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = (left > right) ? left : right;
        return result;
    }
    public static int max(int left, int right, int top) {
        int first = (left > right) ? left : right;
        int result = (first > top) ? first : top;
        return result;
    }
    public static int max(int left, int right, int top, int back) {
        int first = (left > right) ? left : right;
        int second = (top > back) ? top : back;
        int result = (first > second) ? first : second;
        return result;
    }
}