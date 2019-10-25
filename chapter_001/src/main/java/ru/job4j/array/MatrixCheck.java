package ru.job4j.array;

/**
 *  MatrixCheck Класс ищет выигрышную комбинацию из 5 символов в матрице
 *   @author morozsergey30 (karandash.zapiskin@gmail.com)
 */
public class MatrixCheck {

    /**
     * isWin Метод принимает доску с символами и ищет на ней строку или столбец из пяти последовательно стоящих
     *       одинаковых символов.
     * @param board - матрица для поиска выигрышной комбинации
     * @return - результат поиска комбинации
     */
    public static boolean isWin(char[][] board) {
        boolean result = true;
        int index = 0;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                for (int i = 0; i < board.length; i++) {
                    if (sign != board[row][i]) {
                        for (int j = 0; j < board.length; j++) {
                            if (board[row][i] != board[j][i]) {
                                result = false;
                                return result;
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }

}
