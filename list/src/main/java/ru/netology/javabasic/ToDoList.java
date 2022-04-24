package ru.netology.javabasic;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private final List<String> list = new ArrayList<>();

    public void addTask(String task) {
        list.add(task);
    }

    public void removeTask(int index) {
        list.remove(index);
    }

    public void printList() {
        if (!list.isEmpty()) {
            System.out.println("Список задач:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ") " + list.get(i));
            }
        } else {
            System.out.println("Список задач пуст");
        }
    }

    public static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");
        System.out.print(">> ");
    }
}
