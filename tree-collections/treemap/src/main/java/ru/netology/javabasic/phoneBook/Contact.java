package ru.netology.javabasic.phoneBook;

import java.util.Objects;

public class Contact {
    private final String phoneNumber;
    private String name;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }
        Contact contact = (Contact) obj;
        return phoneNumber.equals(contact.phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("%s - тел. %s", name, phoneNumber);
    }
}
