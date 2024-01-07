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

String s2 = "hroonhfrgjstwijdjz";

        for (int i = 0; i < s2.length(); i++) {
            boolean isRepeating=false;
            for (int j = 0; j < s2.length(); j++) {
                if (i!=j && s2.charAt(i)==s2.charAt(j)){
                    isRepeating=true;
                    break;
                }
            }if (!isRepeating){
                System.out.println(s2.charAt(i));
                break;
            }
        }
    }
}
