package org.example;

import java.util.ArrayList;

public class A_10_RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> strArr=new ArrayList<>();
        strArr.add("telephone");
        strArr.add("desktop");
        strArr.add("phone");
        strArr.add("notebook");
        strArr.add("desktop");
        strArr.add("phone");
        strArr.add("laptop");
        strArr.add("phone");
        System.out.println("Full list: "+strArr);

        ArrayList<String> removeDuplicates = new ArrayList<>();
        for (String str:strArr){
            if (!removeDuplicates.contains(str)){
                removeDuplicates.add(str);
            }
        }
        System.out.println(removeDuplicates);
    }
}
