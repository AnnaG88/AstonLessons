package org.example.Lesson_6;

import org.example.Lesson_6.Animal.Animal;
import org.example.Lesson_6.Animal.Bowl;
import org.example.Lesson_6.Animal.Cat;
import org.example.Lesson_6.Animal.Dog;
import org.example.Lesson_6.Figures.Circle;

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


/*    Задание 2:
Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур:
круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик (Периметр, площадь, цвет фона, цвет границ) по каждой
Фигуре вывести в консоль.
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных
методов в интерфейсе.
 */
        System.out.println("\n\n№ 2");
        Circle circle = new Circle(6, "зеленый", "черный");
        circle.printInfo();

    }
}

/*    Задание 1:
 Создать классы Собака и Кот с наследованием от класса Животное.
 Все животные могут бежать и плыть.
 В качестве параметра каждому методу передается длина препятствия.
 Результатом выполнения действия будет печать в консоль.
 (Например, dogBobik.run(150); -> "Бобик пробежал 150 м.);
 У каждого животного есть ограничения на действия
 (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.)
 Добавить подсчет созданных котов, собак и животных.

 Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
 - Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды
 (например, в миске 10 еды, а кот пытается покушать 15-20).
 - Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
 удалось покушать (хватило еды), сытость = true.
 - Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть
 наполовину сыт (это сделано для упрощения логики программы).
 - Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом
 вывести информацию о сытости котов в консоль.
 - Добавить метод, с помощью которого можно было бы добавлять еду в миску.
 */

