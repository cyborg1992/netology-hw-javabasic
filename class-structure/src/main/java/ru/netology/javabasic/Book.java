package ru.netology.javabasic;

public class Book {
    public String title;
    public Author author;
    public String genre;
    public int year;
    public int pageCount;

    public Book(String title, Author author, String genre, int year, int pageCount) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.pageCount = pageCount;
        this.author.bookCount++;
    }

    public void compareTo(Book book) {
        System.out.println("Сравнение книги \"" + this.title + "\" и \"" + book.title + "\"");
        if (author.equals(book.author)) {
            System.out.println("У обеих книг автор " + author.name);
        } else {
            System.out.println("У книг разные авторы. У первой " + author.name
                    + ", у второй " + book.author.name);
        }
        if (genre.equals(book.genre)) {
            System.out.println("Обе книги из жанра \"" + genre + "\"");
        } else {
            System.out.println("Книги из разных жанров. У первой жанр \"" + genre
                    + "\", у второй " + book.genre + "\"");
        }
    }

    public void printBookInfo() {
        System.out.println("Информация о книге \"" + title + "\"");
        System.out.println("Автор: " + author.name);
        System.out.println("Жанр: " + genre);
        System.out.println("Год издания: " + year);
        System.out.println("Количество страниц в книге: " + pageCount);
    }

    @Override
    public String toString() {
        return "Книга {" +
                "Наименование:'" + title + '\'' +
                ", Автор:" + author.name +
                ", Жанр:'" + genre + '\'' +
                ", Год издания:" + year +
                '}';
    }
}

