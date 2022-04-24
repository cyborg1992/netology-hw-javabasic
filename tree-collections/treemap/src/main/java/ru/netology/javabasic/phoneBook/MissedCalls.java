package ru.netology.javabasic.phoneBook;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void add(LocalDateTime time, String phone) {
        missedCalls.put(time, phone);
    }

    public void showMissedCalls(PhoneBook phoneBook) {
        System.out.println("Список пропущенных вызовов");
        for (Map.Entry<LocalDateTime, String> missedCall : missedCalls.entrySet()) {
            LocalDateTime time = missedCall.getKey();
            String phone = missedCall.getValue();
            Contact contact = phoneBook.findByNumber(phone);
            System.out.println(time.format(DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm")) + " " +
                    (contact == null ? phone : contact.getName()));
        }
    }

}
