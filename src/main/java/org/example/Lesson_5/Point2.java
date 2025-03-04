package org.example.Lesson_5;

/*      Задание 2
Создать массив из 5 товаров.
    Пример:
    // вначале объявляем массив объектов
    Product[] productArray = new Product[5];
    // потом для каждой ячейки массива задаем объект
    productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
            "Samsung Corp.”, "Korea" , 5599, true);
    productsArray[1] = new Product(...);
    ...
    productsArray[4] = new Product(...);
*/

public class Point2 {
    public static boolean point2() {
        Product[] productsArray = new Product[5]; // объявляем массив из 5 объектов
        // для каждой ячейки массива задаем объект
        productsArray[0] = new Product("Samsung S25", "01.02.2025", "Samsung Corp.", "Korea", 5599, false);
        productsArray[1] = new Product("LG P715", "01.03.2024", "LG Electronics", "Korea", 6965, false);
        productsArray[2] = new Product("Nokia N8", "01.04.2023", "Nokia Oy", "Finland", 4534, false);
        productsArray[3] = new Product("Honor 9", "01.05.2022", "Huawei", "China", 3534, false);
        productsArray[4] = new Product("iPhone 5s", "01.06.2021", "Apple Inc.", "USA", 9345, false);
        for (Product product : productsArray) {
            product.infoPrintConsoleProduct();
        }
        return false;
    }
}
