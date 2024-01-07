package org.example;

public class A_01_SwapString {
    public static void main(String[] args) {
        String str1 = "New";
        String str2 = "Year";
        System.out.println("Before swap; " + str1 + " - " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swap; " + str1 + " - " + str2);


    }
}
