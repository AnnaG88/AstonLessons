package org.example;
/*
Задание 2
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько
телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        */

import java.util.HashMap;

public class TelephoneBook {

    // коллекция будет хранить ключ-фамилию и значение-тел
    static HashMap<String, String> telephoneBook = new HashMap<>();

    // метод для добавления контакта
    public void adddd(String surName, String phoneNumber) {
        telephoneBook.put(surName, phoneNumber);
    }

    // метод для распечатки книги
    public void printBook() {
        System.out.println(telephoneBook);
    }

    // метод вернуть значение по ключу-фамилии
    public String getttt(String surName) {
        return telephoneBook.get(surName);
    }

    // метод проверить есть ли такой тел-значение
    public static boolean containsKeyContact(String phoneNumber) {
        return telephoneBook.containsKey(phoneNumber);
    }
}
