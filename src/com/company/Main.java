package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        //Работа с массивом
        Point[] arr = new Point[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Point(i, i + 1);
            arr[i].output();
        }

        //Конкатенация строк
        System.out.println("\n\n\nString processing");
        String s1 = "hello", s2 = "world";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        //Сравнение строк
        if (s1.equals(s2) == false) {
            System.out.println(s1 + " and " + s2 + " aren't equal");
        }

        //Разделение строк
        String[] words = s3.split(" ");
        for (String i : words) {
            System.out.println(i);
        }

        //Замена в строке
        String s4 = s3.replace("hello", "goodbye");
        System.out.println(s4);

        //Изменение регистра
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());

    }
}
