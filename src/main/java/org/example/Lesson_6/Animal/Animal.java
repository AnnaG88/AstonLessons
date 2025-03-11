package org.example.Lesson_6.Animal;

// Супер класс от которого будут наследоваться классы Кот и Дог

public class Animal { // описываем какими характеристиками обладают объекты животные
    protected String color;
    public String name;
    private static int animalCount;

    public Animal(String color, String name) { // конструктор класса Animal
        this.color = color;      // цвет
        this.name = name;        // имя
        animalCount++;                 // счетчик животных
    }

    public static int animalCount() {
        return animalCount;
    }

    public void run(int length) {
        System.out.println(color + name + " пробежал " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(color + name + " проплыл " + length + " м.");
    }
}