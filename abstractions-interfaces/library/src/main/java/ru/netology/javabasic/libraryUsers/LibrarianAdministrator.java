package ru.netology.javabasic.libraryUsers;

public class LibrarianAdministrator extends User implements Librarian, Administrator {

    public LibrarianAdministrator(String name) {
        super(name);
    }


    @Override
    public void findBook(String bookName) {
        System.out.printf("Администратор \"%s\" нашел книгу \"%s\"%n",
                name,
                bookName);
    }

    @Override
    public void giveBook(Reader reader, String bookName) {
        System.out.printf("Администратор \"%s\" выдал книгу \"%s\" читателю \"%s\"%n",
                name,
                bookName,
                reader.getName()
        );
    }

    @Override
    public void overdueNotification(Reader reader, String bookName) {
        System.out.printf("Администратор \"%s\" выдал уведомление читателю \"%s\" " +
                        "о просроченом времени возврата книги \"%s\"%n",
                name,
                reader.getName(),
                bookName
        );
    }

    @Override
    public void orderBook(Supplier supplier, String bookName) {
        System.out.printf("Библиотекарь \"%s\" заказал книгу \"%s\" у поставщика \"%s\"%n",
                name,
                bookName,
                supplier.getName()
        );
    }
}
