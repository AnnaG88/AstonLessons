package org.example.Lesson_6;

import org.example.Lesson_6.Animal.Animal;
import org.example.Lesson_6.Animal.Bowl;
import org.example.Lesson_6.Animal.Cat;
import org.example.Lesson_6.Animal.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(" белый ", " Рекс ");  // инициализируем животных
        Dog dog2 = new Dog(" черный ", " Бим ");
        Cat cat1 = new Cat(" рыжий ", " Мурзик ");

        int minValue = 1;
        int maxValue = 240;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));

        dog1.run(randomValue);
        dog2.run(600);
        dog1.swim(randomValue);
        dog2.swim(8);

        cat1.run(randomValue);
        cat1.swim(randomValue);

        System.out.println(" \n Всего животных: " + Animal.count +
                ", из них кошек " + Cat.getCatCount() + ", и собак " + Dog.getDogCount() + "\n");


        Cat[] cats = new Cat[5]; // Создаем массив из 5 котов
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("окрас", " Кот № " + (i + 1)); // Инициализируем котов
        }

        Bowl bowl = new Bowl(35); // Создаем миску с едой и определяем количество еды

        for (int i = 0; i < cats.length; i++) {
            int foodTaken = bowl.getFood(10);
            cats[i].eat(foodTaken);
            if (i < cats.length - 1) {
                System.out.print("\n Осталось в миске " + bowl.FoodAmount() + " --> ");
            }
        }

        for (Cat cat : cats) { // проверяем условие сытости
            if (cat.fullness) {
                System.out.println(cat.name + " сытый.");
            } else {
                System.out.println(cat.name + " голодный.");
            }
        }

        cat1.eat(bowl.getFood(10));
        System.out.println("Осталось в миске " + bowl.FoodAmount());
        bowl.addFood(10);
        cat1.eat(bowl.getFood(10));




    }
}

