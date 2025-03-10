package org.example.Lesson_8;

// исключения для некорректных данных в массиве
public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super("Некорректные данные "+message);
    }
}