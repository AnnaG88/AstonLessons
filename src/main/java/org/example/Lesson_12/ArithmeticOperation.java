package org.example.Lesson_12;

public class ArithmeticOperation {
    private int a;
    private int b;

    public ArithmeticOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void summa() {
        int resultOperation = a + b;
        System.out.println(" сложение : " + a + " + " + b + " = " + resultOperation);
    }

    public void subtraction() {
        int resultOperation = a - b;
        System.out.println(" вычитание : " + a + " - " + b + " = " + resultOperation);
    }

    public void multiplication() {
        int resultOperation = a * b;
        System.out.println(" умножение : " + a + " * " + b + " = " + resultOperation);
    }

    public void division() {
        if (b != 0) {
            double resultOperation = (double) a / b;
            System.out.println(" деление : " + a + " / " + b + " = " + resultOperation);
        } else {
            System.out.println(" на 0 делить нельзя ");
        }
    }

}