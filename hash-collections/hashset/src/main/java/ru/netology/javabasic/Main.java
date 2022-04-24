package ru.netology.javabasic;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> studentsList = new HashSet<>();
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] inputArray = input.split(", ");
            if (inputArray.length != 3) {
                System.out.println("Неправильный ввод. Попробуйте еще раз:");
                continue;
            }
            String name = inputArray[0];
            String group = inputArray[1];
            String studentId = inputArray[2];
            if (!studentsList.add(new Student(name, group, studentId))) {
                System.out.println("Такой студент уже существует");
            }
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\")");
        }

        System.out.println("Список студентов:");
        printStudentList(studentsList);
    }

    public static void printStudentList(HashSet<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
