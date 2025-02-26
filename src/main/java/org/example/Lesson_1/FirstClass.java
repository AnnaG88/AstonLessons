package org.example.Lesson_1;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class FirstClass {
    public static void main(String[] args){ // типы данных
        byte test1 =127;
        short test2 =32767;
        int test3 =2147483647;
        long test4 =922222222;
        boolean test5 =false;
        double test6 =4.332222223;
        float test7 =12.23f;
        char test8 ='g';
        System.out.println(test8);

        int test9 =9;
        int test10 = test9*2;
        System.out.println(test10*10);

        String nameAnna = "anna"; // ссылочные типы данных
        System.out.println(nameAnna.toUpperCase(Locale.ROOT));
        System.out.println(nameAnna.length());

        String s1 = "Java";
        String s2 = new String("Home");
        String s3 = new String(new char[]{'A','B','C'});
        String s4 = new String (s3);
        String s5 = new String (new byte[]{65,66,67});
        String s6 = new String (new byte[]{0, 65,0, 66}, StandardCharsets.UTF_16);
        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s, s6 = %s", s1, s2, s3, s4, s5, s6);

        int age = 20;                      // цифра в текст, строку
        String age1 = String.valueOf(age); //

        someInfo1();
        sumTest(2,3);
    }

    public static void someInfo1(){ // методы
        System.out.println(" этот метод что то делает");
    }

    public static String someInfo2(){
        return "sgdrshftjgjdy";
    }

    int age =1;
    public int someInfo3(){ // метод возвращает
        return age;
    }

    public static void sumTest(int a, int b){
        System.out.println(a+b);
    }
}
