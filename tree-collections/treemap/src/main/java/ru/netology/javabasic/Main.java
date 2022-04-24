package ru.netology.javabasic;

import ru.netology.javabasic.phoneBook.Contact;
import ru.netology.javabasic.phoneBook.MissedCalls;
import ru.netology.javabasic.phoneBook.PhoneBook;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();
        Contact contact1 = PhoneBook.createContact("Андрей", "8(928)123-45-67");
        Contact contact2 = PhoneBook.createContact("Петя", "8(123)456-78-90");
        Contact contact3 = PhoneBook.createContact("Вася", "8(987)654-32-10");
        fillGroups(phoneBook, contact1, contact2, contact3);
        fillMissedCalls(missedCalls);
        missedCalls.showMissedCalls(phoneBook);
    }

    private static void fillGroups(PhoneBook phoneBook, Contact... contact) {
        phoneBook.addContactToGroups(contact[0], "Family", "Worker");
        phoneBook.addContactToGroups(contact[1], "Family");
        phoneBook.addContactToGroups(contact[2], "Friends");
    }

    private static void fillMissedCalls(MissedCalls missedCalls) {
        LocalDateTime time = LocalDateTime.now();
        missedCalls.add(time, "8(333)333-33-33");
        missedCalls.add(time.minusHours(5), "8(928)123-45-67");
        missedCalls.add(time.minusDays(1), "8(000)000-00-00");
        missedCalls.add(time.minusWeeks(1), "8(123)456-78-90");
        missedCalls.add(time.minusMonths(1), "8(111)111-11-11");
        missedCalls.add(time.minusMinutes(30), "8(987)654-32-10");
        missedCalls.add(time.minusYears(1), "8(987)654-32-10");
    }
}




