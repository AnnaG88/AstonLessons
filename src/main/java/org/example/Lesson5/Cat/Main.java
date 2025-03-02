package org.example.Lesson5.Cat;

import org.example.Lesson5.Dog.Dog;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 1;
        System.out.println(barsik.age);

        Cat myrzik = new Cat();
        System.out.println(myrzik.age);
        System.out.println(myrzik.color);
        System.out.println(myrzik.cccccc);

        System.out.println(myrzik.poroda);
        myrzik.haracter = "спокойный";
        System.out.println(myrzik.haracter);
    }
    Dog dog1 = new Dog("Рекс", "белый", 5);
}
