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

        System.out.println("=========================");
        String a = "Hello";
        String b = "world";
        System.out.println("Before: "+a+" - "+b);
        a=a+b;
        System.out.println(a);
        b=a.substring(0,a.length()-b.length());
        System.out.println(b);
        a=a.substring(a.length()-b.length());
        System.out.println(a);
        System.out.println("After: "+a+" - "+b);
    }
}
