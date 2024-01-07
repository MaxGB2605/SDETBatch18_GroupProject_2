package org.example;

public class A_02_AlphaCharacter {
    public static void main(String[] args) {

        String str = "Find out how many alpha characters are present in a string";
        int count = 0;
        char a = 'a';
        char a1 = 'A';
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)==a || str.charAt(i)==a1){
                count++;
            }
        }
        System.out.println("Alpha character count is: "+count);
    }
}
