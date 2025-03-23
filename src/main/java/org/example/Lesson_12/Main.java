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

        int[] numbers = { -1, 0, 1, 2, 3, 4, 5, 6}; // массив чисел для которых будем...
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
        operation1.summa();
        operation1.subtraction();
        operation1.multiplication();
        operation1.division();

        ArithmeticOperation operation2 = new ArithmeticOperation(20, 0);
        operation2.summa();
        operation2.subtraction();
        operation2.multiplication();
        operation2.division();


        CompareNumber num1 = new CompareNumber(10);
        CompareNumber num2 = new CompareNumber(20);
        num1.compare(num2);
    }
}