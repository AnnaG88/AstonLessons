package org.example.Lesson_6.Figure;

// имплемент от интерфейса фигуры + дополнительно параметры и методы для треугольника
public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double pp = (a + b + c) / 2;  // полупериметр
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)); // по формуле Герона
    }

    @Override
    public String fillColor() {
        return fillColor;
    }

    @Override
    public String borderColor() {
        return borderColor;
    }

    @Override
    public void printInfo() {
        System.out.println("\nТреугольник:");
        Figure.super.printInfo();
    }
}
