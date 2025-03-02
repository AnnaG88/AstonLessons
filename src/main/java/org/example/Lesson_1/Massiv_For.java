package org.example.Lesson_1;

import java.util.Arrays;

public class Massiv_For {
    public static void main(String[] args){

        int [] arrrr = new int[10]; // массив с циклом одномерный
        for( int i = 0; i < 10; i++){
            arrrr [i] = i;
        }
        System.out.println(Arrays.toString(arrrr));


        int counter = 1; // массив с циклом двумерный
        int [] [] table = new int[3][4];
        for( int i = 0; i < 3; i++){
            for( int j = 0; j < 4; j++){
                table [i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter ++;
            }
            System.out.println();
        }


    }
}
