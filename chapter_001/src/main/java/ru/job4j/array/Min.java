package ru.job4j.array;
/**
 * Min Класс используется для поиска минимального числа в массиве.
 * @author morozsergey30 (karandash.zapiskin@gmail.com).
 */
public class Min {
    /**
     * Метод принимает числовой массив, находит в нем минимаотное число и возвращает его.
     * @param array - Массив для поиска.
     * @return - Минимальное число в массиве.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}