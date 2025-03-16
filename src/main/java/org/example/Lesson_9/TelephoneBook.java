package org.example.Lesson_9;
/*
Задание 2
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько
телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TelephoneBook {

    // коллекция будет хранить ключ-фамилию и значение-тел
    private static HashMap<String, List<String>> telephoneBook = new HashMap<>();

    // метод для добавления контакта
    public void adddd(String surName, String phoneNumber) {
        if (!telephoneBook.containsKey(surName)) {
            telephoneBook.put(surName, new ArrayList<>());
        }
        telephoneBook.get(surName).add(phoneNumber);
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
