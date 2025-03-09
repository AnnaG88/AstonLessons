package org.example.Lesson_6.Animal;

// Подкласс Дог наследует класс Animal.

public class Dog extends Animal {    // доп инфо об объектах собаки:
    private int runLength = 500;             // максимальная длина пробежки
    private int swimmingLength = 10;         // максимальная длина плавания
    private static int dogCount = 0; // счетчик

    public Dog(String color, String name) { // конструктор для собак
        super(color, name);
        dogCount++;
    }

    public void run(int length) { // метод описывает бег
        if (length >= runLength) {
            System.out.println(color + name + " не может пробежать " + length + " м.");
        } else {
            System.out.println(color + name + " пробежал " + length + " м.");
        }
    }

    public void swim(int length) { // метод описывает плавание
        if (length >= swimmingLength) {
            System.out.println(color + name + " не может проплыть " + length + " м.");
        } else {
            System.out.println(color + name + "  проплыл " + length + " м. ");
        }
    }

    public static int getDogCount() { // счетчик
        return dogCount;
    }
}