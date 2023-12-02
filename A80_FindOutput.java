package com.mycompany.javabasic3_71;

/**
 * 0
 * 1 2
 * 3 4 5
 * 6 7 8 9
 */
public class A80_FindOutput {

    public static void main(String[] args) {
        int[][] A = new int[4][];
        int k = 0;

//      0 number row e column thakbe ekata
        A[0] = new int[1];
//      0 number row e column thakbe duita
        A[1] = new int[2];
        A[2] = new int[3];
        A[3] = new int[4];
//      assign value        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row + 1; col++) {
                A[row][col] = k;
                k++;
            }

        }
//        display value 
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println("");
        }
    }
}
