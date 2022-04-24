package ru.netology.javabasic.libraryUsers;

public interface Reader extends LibraryUsers {
    void getBook(Administrator administrator, String bookName); //получить книгу

    void returnBook(Administrator administrator, String bookName); //возврат книги
}
