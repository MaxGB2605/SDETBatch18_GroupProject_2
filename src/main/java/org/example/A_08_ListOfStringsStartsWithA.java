package org.example;

import java.util.ArrayList;

public class A_08_ListOfStringsStartsWithA {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Avocado");
        str.add("Tomato");
        str.add("Acorn");
        str.add("Potato");
        str.add("Asparagus");
        str.add("Cucumber");

        ArrayList<String> toKeep = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            String s = str.get(i);
            if (s.startsWith("A")){
                toKeep.add(s.toLowerCase());
            }
        }
        System.out.println(toKeep);
    }
}
