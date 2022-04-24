package ru.netology.javabasic;

public class Candidate implements Comparable<Candidate> {
    private String name;
    private String gender;
    private int age;
    private int relevance;
    private int rating;

    public Candidate(String name, String gender, int age, int relevance, int rating) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-4s %-8d %-14d %-10d", name, gender, age, relevance, rating);
    }

    @Override
    public int compareTo(Candidate o) {
        if (relevance == o.relevance) {
            if (rating == o.rating) {
                if (age == o.age) {
                    return name.compareTo(o.name);
                }
                return o.age - age;
            }
            return o.rating - rating;
        }
        return o.relevance - relevance;
    }
}
