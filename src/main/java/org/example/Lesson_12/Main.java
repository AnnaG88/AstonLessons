package org.example.Lesson_12;

/*
Задание:
Напишите 4 программы:
- позволяющую вычислить факториал числа;
- позволяющую найти площадь треугольника;
- совершающую арифметические действия с двумя целыми числами (сложение, вычитание, деление и умножение);
- сравнивающую два целых числа.
Эти программы должны быть в каждой ветке.

В ветке Lesson_12_junit_5 напишите юнит-тесты для этих программ, используя Junit 5.
В ветке Lesson_12_testng напишите юнит-тесты для этих программ, используя TestNG.
*/

public class Main {
    public static void main(String[] args) {

        int[] numbers = { -1, 0, 1, 2, 3}; // массив чисел для которых будем...
        Factorial factorialCalculator = new Factorial();
        for (int number : numbers) {
            factorialCalculator.factorial(number);
        }


        Triangle triangle1 = new Triangle(1, 2, 3);
        triangle1.printInfo();
        Triangle triangle2 = new Triangle(4, 5, 6);
        triangle2.printInfo();
        Triangle triangle3 = new Triangle(7, 8, 9);
        triangle3.printInfo();


        ArithmeticOperation operation1 = new ArithmeticOperation(10, 5);
        System.out.println(" сложение : " + operation1.summa());
        System.out.println(" вычитание : " + operation1.subtraction());
        System.out.println(" умножение : " + operation1.multiplication());
        System.out.println(" деление : " + operation1.division());


        CompareNumber num1 = new CompareNumber(10);
        CompareNumber num2 = new CompareNumber(20);
        num1.compare(num2);
    }
}