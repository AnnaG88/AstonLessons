package org.example.Lesson_6.Animal;

// Супер класс от которого будут наследоваться классы Кот и Дог

public abstract class Animal { // описываем какими характеристиками обладают объекты животные
    public String color;
    public String name;
    public static int count;
    //static int animalCount = 0;

    public Animal(String color, String name) { // конструктор класса Animall
        this.color = color;      // цвет
        this.name = name;        // имя
        count++;                 // счетчик животных
    }

    public abstract void run(int length);

    public abstract void swim(int length);
}