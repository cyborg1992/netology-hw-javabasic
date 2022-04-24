package ru.netology.javabasic;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 12),
                new Movie("Аватар", 2009, 12),
                new Movie("Алладин", 2019, 6),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre(null, 1956, 18),
                new Theatre("Мастер и Маргарита", 1977, 12),
        };
    }

    public static void validEvent(Event event) {
        if ((event.age == 0) || (event.releaseYear == 0) || (event.title == null)) {
            throw new RuntimeException("Событие " + event + " не корректно");
        }
    }

    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }


}
