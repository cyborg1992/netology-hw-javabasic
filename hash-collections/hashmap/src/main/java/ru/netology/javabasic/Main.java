package ru.netology.javabasic;

import ru.netology.javabasic.phoneBook.Contact;
import ru.netology.javabasic.phoneBook.PhoneBook;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact1 = PhoneBook.createContact("Андрей", "8(928)123-45-67");
        Contact contact2 = PhoneBook.createContact("Петя", "8(938)123-45-67");
        Contact contact3 = PhoneBook.createContact("Вася", "8(987)654-32-10");
        phoneBook.addContactToGroups(contact1, "Family", "Worker");
        phoneBook.addContactToGroups(contact2, "Family");
        phoneBook.addContactToGroups(contact3, "Friends");
        if (phoneBook.addGroup("Favorite")) {
            System.out.println("Добавлена группы Favorite");
        }

        phoneBook.showGroups();
        System.out.println();

        findGroupsDemo(phoneBook, "Taxi", "Favorite", "Friends", "Worker", "Family");

        findContactDemo(phoneBook, "8(938)123-45-67", "8(938)123-45-68");
    }

    public static void printContactList(HashSet<Contact> contactsList) {
        if (contactsList == null) {
            System.out.println("Группа не найдена");
            return;
        }
        if (!contactsList.isEmpty()) {
            for (Contact contact : contactsList) {
                System.out.println(contact);
            }
        } else {
            System.out.println("Группа пуста");
        }
    }

    public static void printContact(Contact contact) {
        if (contact == null) {
            System.out.println("Контакт не найден");
        } else {
            System.out.println("Найденный контакт -> " + contact);
        }
    }

    public static void findGroupsDemo(PhoneBook phoneBook, String... groups) {
        for (String group : groups) {
            System.out.println("Поиск контактов в группе " + group);
            printContactList(phoneBook.findByGroup(group));
            System.out.println();
        }
    }

    public static void findContactDemo(PhoneBook phoneBook, String... phones) {
        for (String phone : phones) {
            System.out.println("Поиск телефона " + phone);
            printContact(phoneBook.findByNumber(phone));
            System.out.println();
        }
    }
}




