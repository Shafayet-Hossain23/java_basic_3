package com.mycompany.javabasic3_71;

public class A73_forEachLoop {

    public static void main(String[] args) {
        String[] names = {"Junayed", "Shafayet", "Sabith", "Mominul", "Sakowat", "Korban"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        //for each loop
        for(String name:names){
            System.out.println(name);
        }
    }
}
