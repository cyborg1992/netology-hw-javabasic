package ru.netology.javabasic.libraryUsers;

public class ReaderSupplier extends User implements Reader, Supplier {

    public ReaderSupplier(String name) {
        super(name);
    }

    @Override
    public void getBook(Administrator administrator, String bookName) {
        System.out.printf("Читатель \"%s\" взял почитать книгу \"%s\" у администратора \"%s\"%n",
                name,
                bookName,
                administrator.getName()
        );
    }

    @Override
    public void returnBook(Administrator administrator, String bookName) {
        System.out.printf("Читатель \"%s\" вернул книгу \"%s\" администратору \"%s\"%n",
                name,
                bookName,
                administrator.getName()
        );
    }

    @Override
    public void bringBook(Librarian librarian, String bookName) {
        System.out.printf("Поставщик \"%s\" привёз книгу \"%s\" библиотекарю \"%s\"%n",
                name,
                bookName,
                librarian.getName()
        );
    }
}
