package org.example.Les5_Paradigm.Cat;

public class Cat {
    String name;
    String color;
    int age;
    boolean cccccc;
    String poroda;
    String haracter;
    public Cat(){ // конструктор
        name = "имя";
        color = "цвет";
        age = 0;
        poroda = "дворняга";
        haracter = "неизв";
    }
    public Cat(String name, String color, int age){ // конструктор
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
