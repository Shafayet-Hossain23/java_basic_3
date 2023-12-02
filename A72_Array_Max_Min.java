package com.mycompany.javabasic3_71;

import java.util.Scanner;

public class A72_Array_Max_Min {

    public static void main(String[] args) {
        double[] number = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five number: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
        
    }
}
