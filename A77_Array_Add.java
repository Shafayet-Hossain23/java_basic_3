package com.mycompany.javabasic3_71;

import java.util.Scanner;

public class A77_Array_Add {

    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        Scanner input = new Scanner(System.in);
//        insert input for A 2d array
        System.out.println("Give input for array A:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]= ", row, col);
                A[row][col] = input.nextInt();
            }
        }
//        insert input for B
        System.out.println("Give input for array B:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]= ", row, col);
                B[row][col] = input.nextInt();
            }
        }

//        display input
        System.out.println("A: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
                
            }
            System.out.println(" ");
        }
//        display input
        System.out.println(" ");
        System.out.println("B: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + B[row][col]);
                
            }
            System.out.println(" ");
        }

//        Add to array
        System.out.println("\n");
        System.out.println("Sum of A+B: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (A[row][col]+B[row][col]));
               
            }
             System.out.println(" ");
        }
    }

}
