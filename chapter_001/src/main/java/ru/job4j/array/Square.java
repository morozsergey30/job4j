package ru.job4j.array;
/**
 * Square Класс заполняет массив числами возведенными в квадрат.
 * @author morozsergey30 (karandash.zapiskin@gmail.com).
 */
public class Square {
    /**
     * calculate Метод принимает размер массива, создает и заполняет массив квадратами числа, возвращает заполненный массив.
     * @param bound - размер массива.
     * @return - массив заполненый числами.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int num = 1; num <= rst.length; num++) {
            rst[num - 1] = num * num;
        }
        return rst;
    }
}
