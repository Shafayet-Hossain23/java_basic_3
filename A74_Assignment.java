
package com.mycompany.javabasic3_71;

import java.util.Scanner;


public class A74_Assignment {
    public static void main(String[] args) {
        int num;
        String[] weekdays={"sat","sun","mon","tue","wed","thu","fri"};
        Scanner input=new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        num=input.nextInt();
        
        for (int i = 0; i < weekdays.length; i++) {
            if(num==i+1){
                System.out.println("The day is: "+weekdays[i]);
            }
        }
    }
}
