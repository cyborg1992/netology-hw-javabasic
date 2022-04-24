package ru.netology.javabasic;

import ru.netology.javabasic.libraryUsers.LibrarianAdministrator;
import ru.netology.javabasic.libraryUsers.ReaderSupplier;

public class Main {

    public static void main(String[] args) {
        ReaderSupplier supplier = new ReaderSupplier("Петя"); //Поставщик/читатель
        LibrarianAdministrator admin = new LibrarianAdministrator("Вася"); //Администратор/библиотекарь
        String bookName = "Игра престолов";

        admin.orderBook(supplier, bookName);
        supplier.bringBook(admin, bookName);
        admin.findBook(bookName);
        admin.giveBook(supplier, bookName);
        supplier.getBook(admin, bookName);
        admin.overdueNotification(supplier, bookName);
        supplier.returnBook(admin, bookName);
    }
}

