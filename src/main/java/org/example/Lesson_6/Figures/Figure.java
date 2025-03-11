package org.example.Lesson_6.Figures;

interface Figure {
    double perimeter();
    double area();

    String fillColor();
    void fillColor(String color);

    String borderColor();
    void borderColor(String color);

    default void printInfo() {
        System.out.print("периметр = " + perimeter());
        System.out.print(", площадь = " + area());
        System.out.print(", цвет заливки " + fillColor());
        System.out.print(", цвет границы " + borderColor());
    }
}
