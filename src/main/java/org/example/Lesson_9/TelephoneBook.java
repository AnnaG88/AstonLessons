package org.example.Lesson_9;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {

    // коллекция будет хранить ключ-фамилию и значение-тел
    private static HashMap<String, List<String>> telephoneBook = new HashMap<>();

    // метод для добавления контакта
    public void adddd(String surName, String phoneNumber) {
        if (!telephoneBook.containsKey(surName)) {         // если контакт уже есть...
            telephoneBook.put(surName, new ArrayList<>()); // ...помести тел
        }
        telephoneBook.get(surName).add(phoneNumber);

/*
 исключить возможность дублирования номера телефона при его добавлении. Условно Иванову 5 раз добавили один и тот же. номер телефона, но запись долдна быть одна
Так же попробуй реализовать условие, что один номер телефона не можеь быть записан нескольким людям
 */


    }

    // метод для распечатки книги
    public void printBook() {
        System.out.println(telephoneBook);
    }

    // метод вернуть значение по ключу-фамилии
    public List<String> getttt(String surName) {
        return telephoneBook.getOrDefault(surName, new ArrayList<>());
    }

    // метод проверить есть ли такой тел-значение
    public static boolean containsKeyContact(String phoneNumber) {
        return telephoneBook.containsKey(phoneNumber);
    }
}
