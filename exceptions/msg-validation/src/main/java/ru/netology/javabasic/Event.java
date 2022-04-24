package ru.netology.javabasic;

public abstract class Event {
    protected String title;
    protected int releaseYear;
    protected int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }
}
