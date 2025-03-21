package org.example.Les5_Paradigm.Cat;

import org.example.Les5_Paradigm.Dog.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.color = "белый";
        cat1.age = 1;
        System.out.println(cat1.age);

        Cat cat2 = new Cat();
        cat2.name = "Мурзик";
        cat2.color = "черный";
        cat2.age = 2;
        System.out.println(cat2.age);
        System.out.println(cat2.color);
        System.out.println(cat2.cccccc);

        System.out.println(cat2.poroda);
        cat2.haracter = "спокойный";
        System.out.println(cat2.haracter);

        Cat cat3 = new Cat("Буся", "рыжая", 3);
    }
    Dog dog1 = new Dog("Рекс", "белый", 5);
}
