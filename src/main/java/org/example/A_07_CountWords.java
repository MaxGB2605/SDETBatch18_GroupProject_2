package org.example;

public class A_07_CountWords {
    public static void main(String[] args) {
        String s1 = "Hello, world!";
        String[] words1 = s1.split(",+");
        int count1 = 0;
        for (int i = 0; i < words1.length; i++) {
            count1 = count1 + 1;
        }
        System.out.println(count1);
        System.out.println("-------------------------");
        String s2 = "Welcome, to the world of magic!";
        String [] words2 = s2.split("\\s+");
        int count2 = 0;
        for (int i = 0; i < words2.length; i++) {
            count2++;
        }
        System.out.println(count2);
    }
}
