package org.example.Les5_Paradigm.Dog;

public class Dog {
    String name;
    String color = "---";
    int age;

    public Dog(String _name, String _color, int _age) {
        name = _name;
        color = _color;
        age = _age;
        System.out.println(" имя " + name + " цвет " + color + " возраст " + age);
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println(" имя " + name + " цвет " + color);
    }

}


