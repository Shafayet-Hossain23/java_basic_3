package com.mycompany.javabasic3_71;



public class A79_FindOutPut {

//      0  1  2  3  4
//      5  6  7  8  9
//      10 11 12 13 14
//      15 16 17 18 19

    
    public static void main(String[] args) {
        int[][] A = new int[4][5];
        int k = 0;
//        assign value
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                A[row][col] = k;
                k++;
            }
        }

//        display value 
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println("");
            
        }
        
    }
    
}
