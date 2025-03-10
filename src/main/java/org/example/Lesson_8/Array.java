package org.example.Lesson_8;

public class Array {
    public static void array() {

        int counter = 1; // массив с циклом двумерный
        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = counter;
                System.out.print(array[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
}