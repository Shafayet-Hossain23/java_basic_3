package com.mycompany.javabasic3_71;

import java.util.Arrays;

public class A81_Array_Ascending {

    public static void main(String[] args) {
        int[] number = {20, 7, 30, 5, -3};
        String[] name = {"shafayet", "junayed", "mominul", "sakowat"};

        Arrays.sort(number);
        Arrays.sort(name);
//        number
        System.out.println("Ascending: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print("\t" + number[i]);
        }
        System.out.println("");
        System.out.println("Descending: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print("\t" + number[i]);
        }

//       string ....
        System.out.println("");
        System.out.println("Ascending: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print("\t" + name[i]);
        }
        System.out.println("");
        System.out.println("Descending: ");
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print("\t" + name[i]);
        }
    }
}
