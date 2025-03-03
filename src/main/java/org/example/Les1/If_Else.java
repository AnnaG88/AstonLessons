package org.example.Les1;

public class If_Else {
    public static void main(String[] args){
        int a = 7;
        if(a == 5) { // отработает первый подходящий if и выйдет
            System.out.println("число равно 5");
        }
        else if (a > 5){
            System.out.println("число больше 5");
        }
        else {
            System.out.println("число меньше 5");
        }
    }
}

