package ru.netology.javabasic;

public class Author {
    public String name;
    public int yearOfBirth;
    public String country;
    public int bookCount = 0;

    public Author(String name, int yearOfBirth, String country) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Автор {" +
                "Имя:'" + name + '\'' +
                ", Год рождения:" + yearOfBirth +
                ", Страна:'" + country + '\'' +
                ", Кол-во книг:" + bookCount +
                '}';
    }
}
