package org.example.Lesson_8;

// исключения для неправильного размера массива
public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("массив не корректный");
    }
}
