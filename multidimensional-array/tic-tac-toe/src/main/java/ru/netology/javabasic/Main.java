package ru.netology.javabasic;

import java.util.Random;

public class Main {
    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {
        System.out.println("ДЕМОНСТРАЦИЯ ИГРЫ КРЕСТИКИ - НОЛИКИ\n");
        char[][] field = new char[SIZE][SIZE];

        Random random = new Random();
        for (int col = 0; col < SIZE; col++) { //заполнение поля разными значениями Х/0
            for (int row = 0; row < SIZE; row++) {
                int intRandom = random.nextInt(3);
                switch (intRandom) {
                    case 0:
                        field[col][row] = EMPTY;
                        break;
                    case 1:
                        field[col][row] = CROSS;
                        break;
                    case 2:
                        field[col][row] = ZERO;
                        break;
                }
            }
        }
        printDemo(field);

        field = new char[][]{
                {ZERO, ZERO, ZERO, EMPTY, EMPTY},
                {CROSS, CROSS, CROSS, CROSS, CROSS},
                {CROSS, ZERO, CROSS, ZERO, CROSS},
                {ZERO, ZERO, EMPTY, ZERO, CROSS},
                {ZERO, EMPTY, ZERO, CROSS, CROSS}};
        printDemo(field);

        field = new char[][]{
                {CROSS, ZERO, EMPTY, EMPTY, EMPTY},
                {EMPTY, CROSS, ZERO, EMPTY, EMPTY},
                {CROSS, EMPTY, CROSS, ZERO, EMPTY},
                {ZERO, ZERO, EMPTY, CROSS, EMPTY},
                {ZERO, EMPTY, EMPTY, CROSS, CROSS}};
        printDemo(field);

        field = new char[][]{
                {ZERO, ZERO, ZERO, ZERO, ZERO},
                {CROSS, CROSS, CROSS, EMPTY, EMPTY},
                {CROSS, EMPTY, CROSS, CROSS, CROSS},
                {ZERO, EMPTY, EMPTY, EMPTY, CROSS},
                {ZERO, EMPTY, EMPTY, EMPTY, EMPTY}};
        printDemo(field);
    }

    public static boolean isWin(char[][] field, char player) {

        for (int i = 0; i < SIZE; i++) {
            //4 счётчика: по горизонтали, вертикали и два по диагонали
            int[] playerCount = {0, 0, 0, 0};
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == player) { //по горизонтали
                    playerCount[0]++;
                }
                if (field[j][i] == player) { //по вертикали
                    playerCount[1]++;
                }
                if (field[j][j] == player) { // 1‑я диагональ
                    playerCount[2]++;
                }
                if (field[j][SIZE - 1 - j] == player) { //2‑я диагональ
                    playerCount[3]++;
                }
            }
            for (int count : playerCount) { //проверка счётчиков
                if (count == SIZE) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void printDemo(char[][] field) {
        printField(field);
        if (isWin(field, CROSS)) {
            System.out.println("ПОБЕДИЛИ КРЕСТИКИ\n");
        } else if (isWin(field, ZERO)) {
            System.out.println("ПОБЕДИЛИ НОЛИКИ\n");
        } else {
            System.out.println("НИКТО НЕ ПОБЕДИЛ\n");
        }
    }
}