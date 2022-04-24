package ru.netology.javabasic.libraryUsers;

public interface Administrator extends LibraryUsers {
    void findBook(String bookName); //поиск книги bookName

    void giveBook(Reader reader, String bookName); //выдача книги bookName

    void overdueNotification(Reader reader, String bookName); //уведомление читателя о просрочке времени возврата
}
