/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabasic3_71;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HP
 */
public class A89_Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(format);
        System.out.println(formattedTime);
    }
}
