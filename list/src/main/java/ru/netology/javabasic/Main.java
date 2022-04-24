package ru.netology.javabasic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int action = 1;
        do {
            try {
                ToDoList.printMenu();
                String input = scanner.nextLine();
                action = Integer.parseInt(input);
                switch (action) {
                    case 1:
                        System.out.print("Введите задачу для планирования:\n>> ");
                        input = scanner.nextLine();
                        toDoList.addTask(input);
                        break;
                    case 2:
                        toDoList.printList();
                        break;
                    case 3:
                        System.out.print("Введите номер задачи для удаления:\n>> ");
                        input = scanner.nextLine();
                        toDoList.removeTask(Integer.parseInt(input) - 1);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Вы выбрали несуществующее действие");
                        break;
                }
                System.out.println();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ОШИБКА. Вы ввели несуществующий номер задачи\n");
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА. Вы ввели не целочисленное значение\n");
            }
        } while (action != 0);
    }
}


