package ru.job4j.calculator;
/**
 * Calculator Класс для вычисления арифметических операций + - * /ю
 * @author morozsergey30 (karandash.zapiskin@gmail.com).
 */
public class Calculator {
    /**
     * Метод принимает два числа, складывает их и возвращает результат сложения.
     * @param first - первое слагаемое.
     * @param second - второе слагаемое.
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * Метод принимает два числа, делит их и возвращает результат деления.
     * @param first - делимое.
     * @param second - делитель.
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * Метод принимает два числа, перемножает их и возвращает произведение.
     * @param first - первый множитель.
     * @param second - второй множитель.
     */
    public static void multiple(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    /**
     * Метод принимает два числа, вычитает и возвращает разность.
     * @param first - уменьшаемое.
     * @param second - вычитаемое.
     */
    public static void substract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    /**
     * main Главный метод. Используется здесь для ручного тестирования методов данного класса.
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiple(2, 1);
        substract(10, 5);
    }
}