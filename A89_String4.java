
package com.mycompany.javabasic3_71;


public class A89_String4 {
    public static void main(String[] args) {
        String s1="This_is_my_country";
        String s2=s1.replace('i','j');
        System.out.println("The new one is: "+s2);
        
//      split return an string of array  
       String[] s3= s1.split("_");
        for(String x:s3){
            System.out.println(""+x);
        }
    }
 
}
