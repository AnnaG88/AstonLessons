package org.example.Lesson_6.Animal;

// Подкласс Кот наследует класс Animal.

public class Cat extends Animal {    // доп инфо об объектах коты:
    private final int maxRunLength = 200;             // максимальная длина пробежки
    public boolean fullness = false;                // сытость
    private static int catCount = 0; // счетчик котов

    public Cat(String color, String name) { // конструктор для котов:
        super(color, name);
        catCount++;
    }

    public void run(int length) { // метод описывает бег
        if (length >= maxRunLength) {
            System.out.println(color + name + " не пробежит " + length + " м.");
        } else {
            super.run(length);
        }
    }

    public void swim(int length) { // метод описывает плавание
        System.out.println(name + " не умеет плавать ");
    }

    public static int catCount() { // счетчик кошек
        return catCount;
    }

    //Если в миске достаточно еды, кот становится сытым (fullness = true).

    public void eatCat(int foodAmount) { // метод позволяет коту покушать из миски
        if (foodAmount > 0) {         // если количество еды в миске больше 0
            fullness = true;          // сытость будет удовлетворена = истина
            System.out.print(name + " покушал ");
        } else {                      // иначе
            fullness = false;         // кот голоден false, еды нет
            System.out.println(name + " не может покушать из миски, так как не хватает еды. ");
        }
    }
}