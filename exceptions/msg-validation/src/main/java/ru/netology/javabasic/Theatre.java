package ru.netology.javabasic;

public class Theatre extends Event {
    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }
}
