package org.example.Lesson_6.Figures;

// имплемент от интерфейса фигуры + дополнительно параметры и методы для прямоугольника
public class Rectangle implements Figure {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public double area() {
        return length * width;
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
        System.out.println("\nПрямоугольник:");
        Figure.super.printInfo();
    }
}
