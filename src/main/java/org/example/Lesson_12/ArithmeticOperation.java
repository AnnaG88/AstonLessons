package org.example.Lesson_12;

public class ArithmeticOperation {
    private int a;
    private int b;

    public ArithmeticOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int summa() {
        return a + b;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public double division() {
        if (b != 0) {
            return  (double) a / b;
        } else {
            throw new ArithmeticException("На 0 делить нельзя"); //в случае ошибки
        }
    }

}