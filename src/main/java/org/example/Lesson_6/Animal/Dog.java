package org.example.Lesson_6.Animal;

// Подкласс Дог наследует класс Animal.

public class Dog extends Animal {    // доп инфо об объектах собаки:
    private final int maxRunLength = 500;             // максимальная длина пробежки
    private final int maxSwimLength = 10;         // максимальная длина плавания
    private static int dogCount = 0; // счетчик

    public Dog(String color, String name) { // конструктор для собак
        super(color, name);
        dogCount++;
    }

    public void run(int length) { // метод описывает бег
        if (length >= maxRunLength) {
            System.out.println(color + name + " не может пробежать " + length + " м.");
        } else {
            super.run(length);
        }
    }

    public void swim(int length) { // метод описывает плавание
        if (length >= maxSwimLength) {
            System.out.println(color + name + " не может проплыть " + length + " м.");
        } else {
            super.swim(length);
        }
    }

    public static int getDogCount() { // счетчик
        return dogCount;
    }
}