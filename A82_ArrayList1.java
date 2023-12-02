package com.mycompany.javabasic3_71;

import java.util.ArrayList;

public class A82_ArrayList1 {

    public static void main(String[] args) {
//        declare arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
//        adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
//        adding array with index
        numbers.add(3, 50);

        System.out.println("" + numbers);
        System.out.println("Size of the array is:" + numbers.size());

        for (int number : numbers) {
            System.out.print("\t" + number);
        }
//        removing elements
        System.out.println("");
        numbers.remove(0);
        System.out.println("After removing elements:" + numbers);

        numbers.removeAll(numbers);
        System.out.println("After removing all:" + numbers);

    }
}
