package org.example;

public class A_09_FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s="abracadabra";
        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i),s.indexOf(s.charAt(i))+1)==-1){
                System.out.println("First non repeating character is: "+s.charAt(i));
                break;
            }
        }
        String s1 = "aaggravicapar";
        for(int i=0;i<s1.length();i++){
            if (s1.indexOf(s1.charAt(i),s1.indexOf(s1.charAt(i))+1)==-1) {
                System.out.println("First non repeating character is: " + s1.charAt(i));
                break;
            }
        }


    }
}
