package org.example.Lesson_6.Animal;

/**
 * Подкласс Кот наследует класс Animal.
 */
public class Cat extends Animal {    // доп инфо об объектах коты:
    int runLength = 200;             // максимальная длина пробежки
    boolean fullness;                // сытость
    private static int catCount = 0; // счетчик котов

    public Cat(String color, String name) { // конструктор для котов:
        super(color, name);
        catCount++;
    }

    public void run(int length) { // метод описывает бег
        if (length >= runLength) {
            System.out.println(color + name + " не пробежит " + length + " м.");
        } else {
            System.out.println(color + name + " пробежал " + length + " м.");
        }
    }

    public void swim(int length) { // метод описывает плавание
        System.out.println(name + " не умеет плавать ");
    }

    public static int getCatCount() { // счетчик кошек
        return catCount;
    }

    /**
     * Если в миске достаточно еды, кот становится сытым (fullness = true).
     */
    public void eat(int foodAmount) { // метод позволяет коту покушать из миски
        if (foodAmount > 0) {         // если количество еды в миске больше 0
            fullness = true;          // сытость будет удовлетворена = истина
            System.out.print(name + " покушал ");
        } else {                      // иначе
            fullness = false;         // кот голоден false, еды нет
            System.out.println(name + " не может покушать из миски, так как не хватает еды. ");
        }
    }
}