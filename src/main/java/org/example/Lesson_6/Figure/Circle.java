package org.example.Lesson_6.Figure;

// имплемент от интерфейса фигуры + дополнительно параметры и методы для круга
public class Circle implements Figure {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeter() {
        return (Math.round((2 * Math.PI * radius) * 100.0) / 100.0);
    }

    @Override
    public double area() {
        return (Math.round((Math.PI * radius * radius) * 100.0) / 100.0);
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
        System.out.println("Круг:");
        Figure.super.printInfo();
    }
}
