package org.example.Lesson_5;

import static org.example.Lesson_5.Park.attractions;
import static org.example.Lesson_5.Point2.point2;

public class Main {
    public static void main(String[] args) {
        System.out.println("№ 1");
        Product product1 = new Product("киви", "февраль 2025",
                "Корпорейшен", "Мадагаскар", 800, false);
        product1.infoPrintConsoleProduct();


        System.out.println("\n № 2");
        System.out.println(point2());

        System.out.println("\n № 3");
        System.out.println(attractions());
    }
}