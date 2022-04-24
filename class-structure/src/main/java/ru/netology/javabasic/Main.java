package ru.netology.javabasic;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дж.Роулинг", 1965, "Великобритания");
        Author author2 = new Author("Конан Дойл", 1887, "Великобритания");
        Author author3 = new Author("Лев Толстой", 1883, "Россия");

        Book book1 = new Book("Гарри Поттер и Философский камень", author1,
                "Фэнтэзи", 1997, 300);
        Book book2 = new Book("Гарри Поттер и Тайная комната", author1,
                "Фэнтэзи", 1998, 400);
        Book book3 = new Book("Приключения Шерлока Холмса", author2,
                "Детектив", 1892, 350);
        Book book4 = new Book("Война и Мир", author3,
                "Роман", 1863, 1000);

        User user1 = new User("Ада", "Лавлейс", "adalavleis@gmail.ru");
        User user2 = new User("Билл", "Гейтс", "billgates@gmail.ru");
        User user3 = new User("Линус", "Торвальдс", "linustorvalds@gmail.ru");

        System.out.println("<<<<< Пользователей онлайн: " + User.totalOnline + " >>>>>");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println();
        System.out.println("<<<<< Список писателей >>>>>");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println();
        System.out.println("<<<<< Список книг >>>>>");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println();
        book1.compareTo(book2);
        System.out.println();
        book3.compareTo(book4);
        System.out.println();
        book2.printBookInfo();
    }
}
