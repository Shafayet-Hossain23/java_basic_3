package com.mycompany.javabasic3_71;

import java.util.Scanner;

public class A78_DiagonalMatrix {

    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0, sumOfUpperElements = 0, sumOfLowerElements = 0;

        Scanner input = new Scanner(System.in);
//        insert data
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=", row, col);
                A[row][col] = input.nextInt();
            }
        }
//        display data
        System.out.println("A:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + A[row][col]);
            }
            System.out.println("");
        }

//        sum of diagonal element
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if (row < col) {
                    sumOfUpperElements = sumOfUpperElements + A[row][col];
                }

                if (row > col) {
                    sumOfLowerElements = sumOfLowerElements + A[row][col];
                }

            }
        }
        System.out.println("Sum of all diagonal elements:"+sumOfDiagonalElements);
        System.out.println("Sum of all upper elements:"+sumOfUpperElements);
        System.out.println("Sum of all lower elements:"+sumOfLowerElements);
    }
}
