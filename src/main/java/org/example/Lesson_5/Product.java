package org.example.Lesson_5;

/*      Задание 1
Создать класс "Товар" с полями: название, дата производства, производитель,
страна происхождения, цена, состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
*/

public class Product {
    String name; // определяем какие переменные будут в классе
    String productionDate;
    String manufacturer;
    String countryOrigin;
    int price;
    boolean buyersReservationStatus;

    public Product(String name, String productionDate, String manufacturer, //конструктор
                   String countryOrigin, int price, boolean buyersReservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOrigin = countryOrigin;
        this.price = price;
        this.buyersReservationStatus = true;
    }

    public void infoPrintConsole() {
        System.out.println(" название: " + name + "| дата производства: " + productionDate +
                "| производитель: " + manufacturer + "| страна происхождения: " + countryOrigin +
                "| цена: " + price + "| состояние бронирования покупателем: " + buyersReservationStatus);

    }
}
