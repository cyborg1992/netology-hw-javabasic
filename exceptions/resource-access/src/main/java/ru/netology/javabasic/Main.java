package ru.netology.javabasic;

import java.util.Scanner;

public class Main {
    public static int LIMIT_AGE = 18;

    public static User[] getUsers() {
        return new User[]{
                new User("John", "pass", "john@gmail.com", 24),
                new User("Alex", "qwerty", "alex@gmail.com", 15),
                new User("Emma", "god", "emma@gmail.com", 15),
                new User("Mark", "boss", "emma@gmail.com", 15)
        };
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if ((login.equals(user.getLogin())) && (password.equals(user.getPassword()))) {
                return user;
            }
        }
        throw new UserNotFoundException("User \"" + login + "\" not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {

        if (user.getAge() < LIMIT_AGE) {
            throw new AccessDeniedException("User \"" + user.getLogin() + "\" is young");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);

        System.out.println("Доступ предоставлен");
    }

}
