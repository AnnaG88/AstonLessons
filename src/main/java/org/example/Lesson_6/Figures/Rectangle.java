package org.example.Lesson_6.Figures;

public class Rectangle implements Figure{
    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String fillColor() {
        return "";
    }

    @Override
    public String borderColor() {
        return "";
    }

    @Override
    public void printInfo() {
        Figure.super.printInfo();
    }
}
