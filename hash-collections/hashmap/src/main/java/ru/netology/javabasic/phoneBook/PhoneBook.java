package ru.netology.javabasic.phoneBook;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private final HashMap<String, HashSet<Contact>> phoneBook = new HashMap<>();

    public boolean addGroup(String groupName) {
        if (phoneBook.containsKey(groupName)) {
            return false;
        }
        phoneBook.put(groupName, new HashSet<>());
        return true;
    }

    public void showGroups() {
        System.out.println("Список групп в телефонной книге:");
        for (String s : phoneBook.keySet()) {
            System.out.println(s);
        }
    }

    public void addContactToGroups(Contact contact, String... groups) {
        for (String group : groups) {
            if (!phoneBook.containsKey(group)) {
                addGroup(group);
            }
            final HashSet<Contact> contactList = phoneBook.get(group);
            contactList.add(contact);
        }
    }

    public HashSet<Contact> findByGroup(String groupName) {
        if (phoneBook.containsKey(groupName)) {
            return phoneBook.get(groupName);
        }
        return null;
    }

    public Contact findByNumber(String findNumber) {
        for (HashSet<Contact> contacts : phoneBook.values()) {
            for (Contact contact : contacts) {
                String phoneNumber = contact.getPhoneNumber();
                if (phoneNumber.equals(findNumber)) {
                    return contact;
                }
            }
        }
        return null;
    }

    public static Contact createContact (String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
