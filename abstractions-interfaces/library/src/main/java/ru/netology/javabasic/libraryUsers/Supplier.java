package ru.netology.javabasic.libraryUsers;

public interface Supplier extends LibraryUsers {
    void bringBook(Librarian librarian, String bookName); //привезти книгу в библиотеку
}
