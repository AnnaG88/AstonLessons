package org.example.Lesson_6.Animal;

// Класс описывает миску с едой.

public class Bowl {
    private int foodAmount;  // параметр количество еды в миске

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    // Метод позволяет кушать из миски. Если в миске не хватает еды, нельзя покушать.
    public int getFood(int countFood) {
        if (foodAmount >= countFood) {
            foodAmount -= countFood;
            return countFood;
        } else {
            foodAmount = 0;
            return 0; // Возвращаем 0, если в миске недостаточно еды
        }
    }

    public void addFood(int amount) { // метод addFood позволяет добавить еду в миску
        if (amount > 0) {                 // amount количество еды для добавления
            foodAmount += amount;
            System.out.println("Докинули еды " + amount);
        }
    }

    public int FoodAmount() { // метод возвращает количество еды в миске
        return foodAmount;
    }
}