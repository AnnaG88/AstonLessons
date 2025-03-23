package org.example.Lesson_12;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double pp = (a + b + c) / 2;  // полупериметр
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)); // по формуле Герона
    }

    public void printInfo() {
        System.out.println("площадь треугольника = " + area());
    }
}
