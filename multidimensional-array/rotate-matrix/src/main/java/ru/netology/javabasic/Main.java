package ru.netology.javabasic;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.printf("Дана следующая матрица размером %dx%d:\n", SIZE, SIZE);
        printMatrix(colors);
        System.out.println("Для поворота матрицы введите угол кратный 90 градусам:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int angle = scanner.nextInt();
                if (angle % 90 == 0) {
                    System.out.printf("Вывод матрицы повёрнутой на %d градусов:\n", angle);
                    angle = prepareAngle(angle);
                    int[][] rotatedColors = rotateMatrix(colors, angle);
                    System.out.println("Обычный метод:");
                    printMatrix(rotatedColors);
                    rotatedColors = rotateMatrixRecursive(colors, angle);
                    System.out.println("Рекурсивный метод:");
                    printMatrix(rotatedColors);
                    break;
                } else {
                    System.out.println("Вы ввели угол не кратный 90 градусам. Попробуйте еще раз:");
                }
            } else {
                scanner.next();
                System.out.println("Вы ввели не угол. Введите угол кратный 90");
            }
        }
        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix, int angle) {
        int[][] result = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (angle) {
                    case 0:
                        return matrix;
                    case 90:
                        result[i][j] = matrix[SIZE - 1 - j][i];
                        break;
                    case 180:
                        result[i][j] = matrix[SIZE - 1 - i][SIZE - 1 - j];
                        break;
                    case 270:
                        result[i][j] = matrix[j][SIZE - 1 - i];
                }
            }
        }
        return result;
    }

    public static int[][] rotateMatrixRecursive(int[][] matrix, int angle) { //рекурсивный вариант вращения
        if (angle == 0) {
            return matrix; //если вращать не надо, то возвращаем исходную матрицу
        }

        //рекурсивно вызываем метод с углом вращения на 90 градусов меньше
        int[][] tempArr = rotateMatrixRecursive(matrix, angle - 90);
        int[][] result = new int[SIZE][SIZE];

        //вращение на 90 градусов по часовое стрелке
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result[i][j] = tempArr[SIZE - 1 - j][i];
            }
        }
        return result;
    }

    //метод для приведения значения угла к 0/90/180/270 градусам
    public static int prepareAngle(int angle) {
        while (angle < 0) {
            angle += 360;
        }
        while (angle >= 360) {
            angle -= 360;
        }
        return angle;
    }
}
