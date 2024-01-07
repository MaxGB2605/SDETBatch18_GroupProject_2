package org.example;

public class A_6_Vowels {
    public static void main(String[] args) {
        String s = "replace all letters with something";
        System.out.println(s.replaceAll("[^aeuio]","").length());
    }
}
