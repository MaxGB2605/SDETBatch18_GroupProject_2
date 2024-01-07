package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class A_05_AnagramWithMap {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(countChar(s1));


    }

    public static Map<Character,Integer> countChar(String str){
        Map<Character, Integer> map = new TreeMap<>();
        for (char c:str.toCharArray()){
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        return map;
    }
}


