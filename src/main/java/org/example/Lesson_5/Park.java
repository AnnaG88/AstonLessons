package org.example.Lesson_5;
/*      Задание 3
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить
информацию об аттракционах, времени их работы и стоимости.
*/

public class Park { //класс Парк

    public static class Attraction {   //внутренний класс Аттракцион
        private String nameAttraction; //имя аттракциона
        private String openingTime;    //время работы аттракциона
        private double price;             //стоимость аттракциона

        //конструктор аттракциона:
        public Attraction(String nameAttraction, String openingTime, double price) {
            this.nameAttraction = nameAttraction;
            this.openingTime = openingTime;
            this.price = price;
        }

        //геттеры и сеттеры:
        public String getNameAttraction() {
            return nameAttraction;
        }

        public void setNameAttraction(String nameAttraction) {
            this.nameAttraction = nameAttraction;
        }

        public String getOpeningTime() {
            return openingTime;
        }

        public void setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Park park = new Park(); //создаем объект класса Парк
        //создаем объект класса Аттракцион:
        Park.Attraction attraction1 = new Park.Attraction(" Карусель ", " 9.00-21.00 ", 700);
        Park.Attraction attraction2 = new Park.Attraction(" Батут ", " 9.00-21.00 ", 300);

        //геттерами выводим на печать из привата:
        System.out.println(attraction1.getNameAttraction()
                + attraction1.getOpeningTime()
                + attraction1.getPrice());
        System.out.println(attraction2.getNameAttraction()
                + attraction2.getOpeningTime()
                + attraction2.getPrice());

        //с помощью сеттеры менем имя и выводим результат с гетт:
        attraction1.setNameAttraction("Имя будет Качельки");
        System.out.println(attraction1.getNameAttraction());
    }
}