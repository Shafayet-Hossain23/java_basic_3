package com.mycompany.javabasic3_71;

public class A88_String3 {

    public static void main(String[] args) {
        String country = "  Bangladesh is my country    ";

        char ch = country.charAt(0);
        System.out.println("" + ch);

        int value = country.codePointAt(0);
        System.out.println("" + value);

//        it give first n position number
        int pos = country.indexOf('n');
        System.out.println("" + pos);

//        it give last n position number
        int lastPos = country.lastIndexOf("n");
        System.out.println("" + lastPos);
        
        String withoutSpace=country.trim();
        System.out.println(""+withoutSpace);
    }

}
