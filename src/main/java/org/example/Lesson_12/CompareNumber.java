package org.example.Lesson_12;

public class CompareNumber {
    private int number;

    public CompareNumber(int number) {
        this.number = number;
    }

    public void compare(CompareNumber other) {
        if (this.number > other.number) {
            System.out.println(this.number + " больше, чем " + other.number);
        } else if (this.number < other.number) {
            System.out.println(this.number + " меньше, чем " + other.number);
        } else {
            System.out.println(this.number + " равно " + other.number);
        }
    }
}