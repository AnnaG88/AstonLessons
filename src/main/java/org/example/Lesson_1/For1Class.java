package org.example.Lesson_1;

public class For1Class {
    public static void main(String[] args){
        for (int i =0; i<= 10 ; ++ i){
            //for (int i =0; i<= 10 ; i++ ){
            if ( i > 7 ) {
                break;
            }
            System.out.println("i = " + i);
            // System.out.println( i );
        }


        String[] sm = { "A", "B", "C", "D" };
        for (String o : sm) {
            System.out.print(o + " ");
        }
    }
}
