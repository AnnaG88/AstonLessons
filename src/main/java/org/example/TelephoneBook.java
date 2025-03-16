package org.example;
/*
Задание 2
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько
телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
        */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {

    // коллекция будет хранить ключ-фамилию и значение-тел
    HashMap<String, String> TelephoneBook = new HashMap<>();

    // метод для добавления контакта
    public void addContact(String surname, String phoneNumber) {
        TelephoneBook.put(surname, phoneNumber);
    }

    // метод для распечатки книги
    public void printBook(){
        System.out.println(TelephoneBook);
    }

    /*

        System.out.println(TelephoneBook.get("Георгиева")); // вернуть значение по ключу
        System.out.println(TelephoneBook.containsKey("89173733933")); // проверить есть ли такой ключ
    */
}
