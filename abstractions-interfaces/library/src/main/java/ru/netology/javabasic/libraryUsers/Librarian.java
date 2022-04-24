package ru.netology.javabasic.libraryUsers;

public interface Librarian extends LibraryUsers {
    void orderBook(Supplier supplier, String bookName); //заказ книги
}
