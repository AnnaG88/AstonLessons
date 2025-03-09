package org.example.Lesson_5;

/*      Задание 1
Создать класс "Товар" с полями: название, дата производства, производитель,
страна происхождения, цена, состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
*/

public class Product {
    public String name; // определяем какие переменные будут в классе
    public String productionDate;
    public String manufacturer;
    public String countryOrigin;
    public int price;
    private boolean buyersReservationStatus;

    public Product(String name, String productionDate, String manufacturer, //конструктор
                   String countryOrigin, int price, boolean buyersReservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOrigin = countryOrigin;
        this.price = price;
        this.buyersReservationStatus = true;
    }

    public void infoPrintConsoleProduct() { // метод для печати товара
        System.out.println(" название: " + name + "| дата производства: " + productionDate +
                "| производитель: " + manufacturer + "| страна происхождения: " + countryOrigin +
                "| цена: " + price + "| состояние бронирования покупателем: " + buyersReservationStatus);

    }
}

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