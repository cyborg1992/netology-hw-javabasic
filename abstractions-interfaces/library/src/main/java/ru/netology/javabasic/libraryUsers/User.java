package ru.netology.javabasic.libraryUsers;

public abstract class User implements LibraryUsers {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
