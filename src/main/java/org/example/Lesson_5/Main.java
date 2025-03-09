package org.example.Lesson_5;

public class Main {
    public static void main(String[] args) {
        System.out.println("№ 1");
        Product product1 = new Product("киви", "февраль 2025",
                "Корпорейшен", "Мадагаскар", 800, false);
        product1.infoPrintConsoleProduct();

        System.out.println("\n № 2");
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

        System.out.println("\n № 3");
        //создаем объект класса Аттракцион:
        Park.Attraction attraction1 = new Park.Attraction(" Карусель ", " 9.00-21.00 ", 700);
        Park.Attraction attraction2 = new Park.Attraction(" Батут ", " 9.00-21.00 ", 300);

        attraction1.infoPrintConsoleAttraction();
        attraction2.infoPrintConsoleAttraction();

        //с помощью сеттеры меняем имя и выводим результат с гетт:
        attraction1.setNameAttraction("Имя будет Качельки");
        System.out.println(attraction1.getNameAttraction());
    }
}