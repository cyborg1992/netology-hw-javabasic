package ru.netology.javabasic;

public class User {
    public String name;
    public String surname;
    public String email;
    public static int totalOnline = 0;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        totalOnline++;
    }

    @Override
    public String toString() {
        return "Пользователь {" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", E-mail='" + email + '\'' +
                '}';
    }
}
