package org.example.Lesson1;

public class For_1 {
    public static void main(String[] args){
        for (int i =0; i<= 10 ; ++ i){ // цикл
            //for (int i =0; i<= 10 ; i++ ){
            if ( i > 7 ) {
                break;
            }
            System.out.println("i = " + i);
            // System.out.println( i );
        }


        String[] sm = { "A", "B", "C", "D" }; // цикл фор ич
        for (String o : sm) {
            System.out.print(o + " ");
        }
    }
}
