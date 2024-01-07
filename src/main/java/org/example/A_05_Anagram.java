package org.example;

import java.util.Arrays;

public class A_05_Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        boolean result = Arrays.equals(charArr1, charArr2);

        if (result) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        String a1="Moon";
        String a2="Evening";
        a1=a1.toLowerCase();
        a2=a2.toLowerCase();

        char [] charA1=a1.toCharArray();
        char [] charA2=a2.toCharArray();

        Arrays.sort(charA1);
        Arrays.sort(charA2);

        boolean result1 = Arrays.equals(charA1,charA2);

        if (result1){
            System.out.println(a1+" and "+a2+" are anagrams");
        }else {
            System.out.println(a1+" and "+a2+" are not anagrams");
        }
    }
}


