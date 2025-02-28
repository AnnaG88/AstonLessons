package org.example;

/*      Задание 1
Создать класс "Товар" с полями: название, дата производства, производитель,
страна происхождения, цена, состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
*/

public class Product {
    String name;
    String productionDate;
    String manufacturer;
    String countryOrigin;
    int price;
    String buyersReservationStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOrigin,
                   int price, String buyersReservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOrigin = countryOrigin;
        this.price = price;
        this.buyersReservationStatus = buyersReservationStatus;
        System.out.println(" название " + name + ", дата производства " + productionDate +
                ", производитель " + manufacturer + ", страна происхождения " + countryOrigin +
                ", цена " + price + ", состояние бронирования покупателем " + buyersReservationStatus);
    }
}
