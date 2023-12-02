package com.mycompany.javabasic3_71;

public class A86_String1 {

    public static void main(String[] args) {
        String name1 = "sabith";
        String name2 = new String("Sabith");
        System.out.println("name1:" + name1);
        System.out.println("name2:" + name2);

        int len = name1.length();
        System.out.println("Length:" + len);

//        if(name1.equals(name2)){
//            System.out.println("Equal");
//        }
        if (name1.equalsIgnoreCase(name2)) {
             System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        
        boolean con=name1.contains("bith");
        System.out.println(""+con);
        
        boolean empty=name1.isEmpty();
        System.out.println(""+empty);
    }

}
