
package com.mycompany.javabasic3_71;

import java.util.Scanner;


public class A71_ArraySumAverage {
    public static void main(String[] args) {
        double[] numbers=new double[5];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        numbers[0]=input.nextDouble();
        numbers[1]=input.nextDouble();
        numbers[2]=input.nextDouble();
        numbers[3]=input.nextDouble();
        numbers[4]=input.nextDouble();
        
        double sum= numbers[0]+ numbers[1]+ numbers[2]+ numbers[3]+ numbers[4];
        System.out.println("sum: "+sum);
    }
 
}
