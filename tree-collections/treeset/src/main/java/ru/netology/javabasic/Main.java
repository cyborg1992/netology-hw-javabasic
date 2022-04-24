package ru.netology.javabasic;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Candidate> candidates = new TreeSet<>();
        fillCandidates(candidates);
        System.out.printf("%-30s %-4s %-8s %-14s %-10s%n",
                "ФИО", "Пол", "Возраст", "Релевантность", "Оценка");

        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }

    }

    private static void fillCandidates(Set<Candidate> candidates) {
        candidates.add(new Candidate("Иванов Иван Иванович", "М", 18, 5, 3));
        candidates.add(new Candidate("Петров Петр Петрович", "М", 19, 4, 5));
        candidates.add(new Candidate("Паскаль Делфи Ассемблерович", "М", 20, 3, 4));
        candidates.add(new Candidate("Максимов Максим Максимович", "М", 21, 2, 5));
        candidates.add(new Candidate("Сапожников Матвей Феодосьевич", "М", 22, 1, 5));
        candidates.add(new Candidate("Иванова Анна Ивановна", "Ж", 18, 3, 5));
        candidates.add(new Candidate("Идеешка Джава Андроидовна", "Ж", 50, 5, 5));
        candidates.add(new Candidate("Петрова Инна Сергеевна", "Ж", 20, 4, 2));
        candidates.add(new Candidate("Медведева Ангелина Ивановна", "Ж", 21, 3, 4));
        candidates.add(new Candidate("Исмаилова Ольга Тофиковна", "Ж", 22, 5, 5));
        candidates.add(new Candidate("Григорьева Жанна Алексеевна", "Ж", 23, 3, 3));
    }
}
