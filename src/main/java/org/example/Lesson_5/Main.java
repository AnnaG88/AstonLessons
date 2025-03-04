package org.example.Lesson_5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("киви", "февраль 2025",
                "Корпорейшен", "Мадагаскар", 800, false);
        product1.infoPrintConsoleProduct();


        System.out.println();


        Park.Attraction attraction1 = new Park.Attraction(" Карусель ", " 9.00-21.00 ", 700);
        Park.Attraction attraction2 = new Park.Attraction(" Батут ", " 9.00-21.00 ", 300);
        attraction1.infoPrintConsoleAttraction();
        attraction2.infoPrintConsoleAttraction();
        //с помощью сеттеры меняем имя и выводим результат с гетт:
        attraction1.setNameAttraction("Имя аттракциона1 будет Качельки");
        System.out.println(attraction1.getNameAttraction());

    }


}