package org.example.Lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();                    // № 1
        checkSumSign();                       // № 2
        printColor();                         // № 3
        compareNumbers();                     // № 4
        System.out.println(checkingTheSumOfNumbers(3, 8)); // № 5
        checkNumberPositiveNegative(-30);  // № 6
        System.out.println(checkNumber(-7));// № 7
        numberInLinePrint("Астон", 4); // № 8
        System.out.println(yearLeap());       // № 9
        arrayNumber();                        // № 10
        arrayNumberOneHundred();              // № 11
        arrayNumberSelectivelyMultiply();     // № 12
        arrayNumberDiagonal();                // № 13
        arrayAnna(7, 5);        // № 14
    }

    /* № 1 Создайте метод printThreeWords, который при вызове должен отпечатать в столбец
           три слова: Orange, Banana, Apple.
    */
    public static void printThreeWords() {
        System.out.println("№ 1");
        System.out.println(" Orange \n Banana "); // перевод строки литералом
        System.out.println(" Apple ");
    }

    /* № 2 Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать
    эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма
    положительная" в противном случае - "Сумма отрицательная”.
    */
    public static void checkSumSign() {
        int a, b, c;                            // резервирую память для целых чисел int
        a = 2;                                   // присваиваю значения
        b = -3;
        c = a + b;                                   // динамически инициализирую с
        System.out.println("\n№ 2");
        if (c >= 0) System.out.println("Сумма положительная"); //если условие выполнится печатаем это
        else System.out.println("Сумма отрицательная");        // иначе печатаем это
    }

    /* № 3 Создайте метод printColor() в теле которого задайте int переменную Value и инициализируйте
    ее любым значением. Если Value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение
    "Красный" если лежит в пределах от (О исключительно) до 100 (100 включительно), то "Желтый",
    если больше 100 (100 исключительно) - "Зеленый".
    */
    public static void printColor() {
        int Value = 10; // резервирую память переменной и сразу присваиваю ей значение
        System.out.println("\n№ 3");
        if (Value <= 0) System.out.println("Красный");
        else if (Value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    /* № 4 Создайте метод compareNumbers(), в теле которого объявите две int переменные а и b,
    и инициализируйте их любыми значениями, которыми захотите. Если а больше или равно b,
    то необходимо вывести в консоль сообщение "а >= b", в противном случае "a < b".
    */
    public static void compareNumbers() {
        int a, b;
        a = 27;
        b = 32;
        System.out.println("\n№ 4");
        if (a >= b) System.out.println("а >= b");
        else System.out.println("a < b");
    }

    /* № 5 Напишите метод принимающий на вход два целых числа и проверяющий, что их
    сумма лежит в пределах от 10 до 20 (включительно), если да - вернуть true,
    в противном случае false.
    */
    public static boolean checkingTheSumOfNumbers(int a, int b) {
        System.out.println("\n№ 5");
        int sum = a + b;
        return sum > 10 && sum <= 20;

        //if (sum > 10 && sum <= 20) return true;
        //else return false;
        //if (sum > 10 && sum <= 20) System.out.println("от 10 до 20");
        //else System.out.println("не в пределах");
    }

    /* № 6 Напишите метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static void checkNumberPositiveNegative(int a) {
        System.out.println("\n№ 6");
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }

    /* № 7 Напишите метод, которому в качестве параметра передается целое число,
    Метод должен вернуть  true, если число отрицательное, и вернуть false если положительное.
    Замечание: ноль считаем положительным числом.
    */
    public static boolean checkNumber(int a) {
        System.out.println("\n№ 7");
        return a < 0;

        //if (a >= 0) return false;
        //else return true;
        //if (a >= 0) System.out.println("false");
        //else System.out.println("true");
    }

    /* № 8 Напишите метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз.
    */
    public static void numberInLinePrint(String str, int a) {
        System.out.println("\n№ 8");
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    /* № 9 Напишите метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 10-го, при этом
    каждый 400-й - високосный.
    */
    public static boolean yearLeap() {
        int year;
        System.out.println("\n№ 9");
        year = 2025;
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        //if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return true;//високосный
        //else return false;// иначе не високосный
        //System.out.println(year + " г. високосный");
    }

    /* № 10 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
    С помощью цикла и условия заменить О на 1, 1 на 0.
    */
    public static void arrayNumber() {
        System.out.println("\n№ 10");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};//задаю массив
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /* № 11 Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 12345678...100.
    */
    public static void arrayNumberOneHundred() {
        System.out.println("\n\n№ 11");
        int[] arr = new int[100]; // объявляю массив длиной 100
        for (int i = 0; i < arr.length; i++) { // заполняю
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));

    }

    /* № 12 Задать массив [1, 5, 3, 2, 1, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом,
    и числа меньшие 6 умножить на 2.
    */
    public static void arrayNumberSelectivelyMultiply() {
        System.out.println("\n\n№ 12");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    /* № 13 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2]...[n][n].
    */
    public static void arrayNumberDiagonal() {
        System.out.println("\n\n№ 13");
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;                 //первая диагональ
            arr[i][arr.length - i - 1] = 1;//вторая диагональ
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//переход в новую строку массива
        }
    }

    /* № 14 Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue.
    */
    public static int[] arrayAnna(int len, int initialValue) {
        System.out.println("\n№ 14");
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue; //в ячейках массива содержатся initialValue
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
