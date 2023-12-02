package com.mycompany.javabasic3_71;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A89_Date {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("" + date);

//        date formate
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate=dateFormat.format(date);
        System.out.println("Current Date is:"+currentDate);
    }

}
