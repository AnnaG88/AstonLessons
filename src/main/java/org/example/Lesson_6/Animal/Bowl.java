package org.example.Lesson_6.Animal;

// Класс описывает миску с едой.

public class Bowl {
    private int foodAmount;  // параметр количество еды в миске

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    // Метод позволяет кушать из миски. Если в миске не хватает еды, нельзя покушать.
    public int getFood(int foodAmount) {
        if (foodAmount >= 0) {
            this.foodAmount -= foodAmount;
            return foodAmount;
        } else {
            System.out.println("Нельзя положить");
            return 0; // Возвращаем 0, если в миске недостаточно еды
        }
    }

    public void addFood(int amount) { // метод addFood позволяет добавить еду в миску
        if (amount > 0) {                 // amount количество еды для добавления
            foodAmount += amount;
            System.out.println("Докинули еды " + amount);
        } else {
            System.out.println("Нельзя добавить отрицательное или нулевое количество еды.");
        }
    }

    public int foodAmount() { // метод возвращает количество еды в миске
        return foodAmount;
    }
}