package org.example.Les1;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        /*
        int a = 3;
        switch (a) {
            case 1 : // 2*2
                System.out.println("отработал кейс 1");
            case 2 :
                System.out.println("отработал кейс 2");
            case 3 :
                System.out.println("отработал кейс 3");
            case 4 :
                System.out.println("отработал кейс 4");
                break;
            case 5 :
                System.out.println("отработал кейс 5");
        }
    }

*/
/*
    String name = "слово";
        switch (name) {
        case "dgdfgd" : // 2*2
            System.out.println("отработал кейс 1");
        case "shfhfhgh" :
            System.out.println("отработал кейс 2");
        case "слово" :
            System.out.println("отработал кейс слово");
        case "fjdgjg" :
            System.out.println("отработал кейс 4");
            break;
        case "dfjghj" :
            System.out.println("отработал кейс 5");
    }
}
 */

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        switch (age) { // отработает первый подходящий и все после до брейк
            case 1 : // 2*2
                System.out.println("отработал кейс 1");
            case 2 :
                System.out.println("отработал кейс 2");
            case 3 :
                System.out.println("отработал кейс 3");
            case 4 :
                System.out.println("отработал кейс 4");
                break;
            case 5 :
                System.out.println("отработал кейс 5");
        }
    }


}
