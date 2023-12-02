package com.mycompany.javabasic3_71;

public class A87_String2 {

    public static void main(String[] args) {
        String firstName = "Junayed";
        String lastName = " Hossain";

//        concat
//        String fullName1 = firstName + lastName;
//        System.out.println("Full Name : " + fullName1);

        String fullName = firstName.concat(lastName);
        System.out.println("fullName: " + fullName);
//        uppercase lowercase
        String upperName = fullName.toUpperCase();
        System.out.println("upperName: "+upperName);
        
        String lowerName=fullName.toLowerCase();
        System.out.println("lowerName: "+lowerName);
        
        boolean start=fullName.startsWith("Juna");
        System.out.println(""+start);
        
        boolean end=fullName.endsWith("ain");
        System.out.println(""+end);
               
        String[] names={"shafayet","junayed","sabith","shohag"};
        for(String x:names){
            System.out.println(""+x);
        }
    }

}
