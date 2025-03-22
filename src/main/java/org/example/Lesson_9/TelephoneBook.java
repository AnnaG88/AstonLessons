package org.example.Lesson_9;

import java.util.HashMap;
import java.util.*;

public class TelephoneBook {

    // коллекции будут хранить...
    private static HashMap<String, Set<String>> telephoneBook = new HashMap<>();// ключ-фамилию и значение-тел
    private static HashMap<String, String> telephoneName = new HashMap<>();// ключ-тел и значение-фамилия

    // метод для добавления контакта
    public void addContact(String surName, String phoneNumber) {

        if (telephoneName.containsKey(phoneNumber)) { // если тел уже есть...
            System.out.println("номер " + phoneNumber + " уже есть в справочнике");
            return;
        }

        telephoneBook.putIfAbsent(surName, new HashSet<>()); //доб тел к фамилии
        Set<String> telephone = telephoneBook.get(surName);
        telephone.add(phoneNumber);

        telephoneName.put(phoneNumber, surName); // связь тел-фамилия
    }

    // метод для распечатки книги
    public void printBook() {
        System.out.println(telephoneBook);
    }

    // метод вернуть значение по ключу-фамилии
    public Set<String> getNumber(String surName) {
        return telephoneBook.getOrDefault(surName, Collections.emptySet());
    }

    // метод проверить есть ли такой тел-значение
    public static boolean containsKeyContact(String phoneNumber) {
        return telephoneBook.containsKey(phoneNumber);
    }
}
