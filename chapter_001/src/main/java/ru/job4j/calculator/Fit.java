package ru.job4j.calculator;
/**
 * Fit - Класс вычисляет идеальный вес человека по росту в зависимости от пола.
 * @author morozsergey30 (karandash.zapiskin@gmail.com).
 */
public class Fit {
    /**
     * manWeight - Метод принимает рост мужчины в сантиметрах и возвращает идеальный вес для этого роста.
     * @param height - рост мужчины.
     * @return - идеальный вес.
     */
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    /**
     * womanWeight Метод принимает рост женщины в сантиметрах и возвращает идельный вес для этого роста.
     * @param height
     * @return
     */
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
    /**
     * main - используется для ручного тестирования методов данного класса.
     * @param args - args.
     */
    public static void main(String[] args) {
        double man = manWeight(180);
        System.out.println("Man 180 is " + man);
        double woman = womanWeight(160);
        System.out.println("Woman 160 is " + woman);
    }
}