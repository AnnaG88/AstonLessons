package org.example.Lesson_12;

public class Factorial {

    public void factorial(int number) { // сперва проверяем число
        if (number < 0) {                      // есл отриц вообще не считаем
            System.out.println("для отрицательного числа " + number + " факториала не бывает");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("факториал числа " + number + " равен " + factorial);
        }
    }

    private long calculateFactorial(int number) {
        long factorial = 1; // факториал для 0 и 1 всегда равен 1
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}