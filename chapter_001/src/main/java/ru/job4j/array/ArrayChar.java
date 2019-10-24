package ru.job4j.array;

/**
 * ArrayChar Класс определяет начинается ли слово с префикса
 *  @author morozsergey30 (karandash.zapiskin@gmail.com)
 */
public class ArrayChar {
    /**
     * startsWith Метод принимает два масиива Слово и Прификс, определяет начинается ли слово с префикса, возвращает результат проверки
     * @param word - массив символов слова
     * @param pref - массив символов префикса
     * @return результат проверки true/false
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] == word[i]) {
                count++;
            }
        }
        if (count == pref.length) {
            result = true;
        }
        return result;
    }
}
