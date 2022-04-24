package ru.netology.javabasic;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static boolean isNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();
        scanner.close();

        String[] arrayValues = input.split(" ");

        Stack<String> sign = Arrays.stream(arrayValues)
                .filter(value -> !isNumber(value))
                .collect(Collectors.toCollection(Stack<String>::new));

        Queue<Integer> numbers = Arrays.stream(arrayValues)
                .filter(Main::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList<Integer>::new));

        System.out.println("Выражение в формате обратной польской записи:");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pop() + " ");
        }
        System.out.println();
    }

}
