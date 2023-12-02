
package com.mycompany.javabasic3_71;

import java.util.Scanner;


public class A71_Array2 {
    public static void main(String[] args) {
        double sum=0,average;
        double[] number=new double[5];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter five number: ");
        
        for (int i = 0; i < number.length; i++) {
            number[i]=input.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            sum=sum+number[i];
        }
        average=sum/number.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
    }
  
}
