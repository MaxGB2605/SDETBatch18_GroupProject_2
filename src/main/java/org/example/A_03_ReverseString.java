package org.example;

public class A_03_ReverseString {
    public static void main(String[] args) {
        String str = "Happy New Year!";
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("______________");

        String str1 = "Reverse the string";
        String reverse1 = "";
        for (int i = 0; i < str1.length(); i++) {
            reverse1 = str1.charAt(i)+reverse1;
        }
        System.out.println(reverse1);
    }

}
